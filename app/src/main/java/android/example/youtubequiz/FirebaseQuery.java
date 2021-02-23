package android.example.youtubequiz;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.WriteBatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 *
 * Creates Document in Firebase for the user with Email, Username and a UserScore
 * Updates COUNT_USER variable in DB .
 */


public class FirebaseQuery {

    public static FirebaseFirestore g_firestore;
    public static List<ChoicesModel> choicesList = new ArrayList<>();
    public static List<DifficultyModel> difficulty_list = new ArrayList<>();
    public static int g_selected_difficulty_index = 0;
    public static PlayerModel player = new PlayerModel("username", "email",0);

    public static void getPlayerData(CustomCompleteListener completeListener){

        g_firestore.collection("USERS").document(FirebaseAuth.getInstance().getUid())
                .get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {

                        //Set data for the player
                        player.setUsername(documentSnapshot.getString("USERNAME"));
                        player.setEmail(documentSnapshot.getString("EMAIL"));
                        player.setPlayerScore(documentSnapshot.getLong("USER_SCORE").intValue());

                        completeListener.onSucess();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        completeListener.onFailure();

                    }
                });

    }

    public static void createUserData(String email, String username, CustomCompleteListener completeListener){

        Map<String,Object> userData = new HashMap<>();

        userData.put("EMAIL", email);
        userData.put("USERNAME", username);
        userData.put("USER_SCORE", 0);

        DocumentReference  userDocument = g_firestore.collection("USERS").document(FirebaseAuth.getInstance().getCurrentUser().getUid());

        WriteBatch batch = g_firestore.batch();

        batch.set(userDocument,userData);

        DocumentReference countUserDocument = g_firestore.collection("USERS").document("TOTAL_USERS");
        batch.update(countUserDocument, "COUNT", FieldValue.increment(1));

        batch.commit()
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        completeListener.onSucess();

                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        completeListener.onFailure();

                    }
                });

    }


    //Load the Game choices for Homepage in the Firebase DB
    public static void loadGameChoices(CustomCompleteListener completeListener){
        choicesList.clear();

        g_firestore.collection("GAME").get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {

                        Map<String, QueryDocumentSnapshot> documentList = new HashMap<>();

                        for (QueryDocumentSnapshot doc: queryDocumentSnapshots){
                            documentList.put(doc.getId(),doc);
                        }

                        QueryDocumentSnapshot choicesListDocument = documentList.get("Categories");

                        long choicesCount = choicesListDocument.getLong("COUNT");

                        for (int i=1; i <= choicesCount; i++){
                            String choiceID = choicesListDocument.getString("CHOICE" + i + "_ID");

                            QueryDocumentSnapshot ChoiceDoc  = documentList.get(choiceID);

                            String choiceName = ChoiceDoc.getString("NAME");

                            choicesList.add(new ChoicesModel(choiceID, choiceName ));
                        }

                        completeListener.onSucess();

                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        completeListener.onFailure();

                    }
                });
    }
//
//    public static void loadDifficultyData(CustomCompleteListener completeListener){
//        difficulty_list.clear();
//
//        g_firestore.collection("GAME").document(difficulty_list.get(g_selected_difficulty_index).getDifficulty())
//                .collection("DIFFICULTY_LIST").document("DIFFICULTY_INFO")
//                .get()
//                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
//                    @Override
//                    public void onSuccess(DocumentSnapshot documentSnapshot) {
//
//                        //int NumberLives = difficulty_list.get(g_selected_difficulty_index).();
//
//                        for (int i=1; i<= 3; i ++){
//                            difficulty_list.add(new DifficultyModel(
//                                    documentSnapshot.getString("DIFFICULTY" + i + "_ID"),
//                                    documentSnapshot.getLong("DIFFICULTY" + i + "_LIVES").intValue()
//                            ));
//                        }
//                    completeListener.onSucess();
//
//                    }
//                })
//                .addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//
//                        completeListener.onFailure();
//
//                    }
//                });
//
//    }

    public static void loadData(CustomCompleteListener completeListener){
        loadGameChoices(new CustomCompleteListener() {
            @Override
            public void onSucess() {
                getPlayerData(completeListener);

            }

            @Override
            public void onFailure() {
                 completeListener.onFailure();
            }
        });
    }
}
