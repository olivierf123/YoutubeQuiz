package android.example.youtubequiz;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ChoicesAdapter extends BaseAdapter {

    private List<ChoicesModel> choices_list;

    public ChoicesAdapter(List<ChoicesModel> choices_list) {
        this.choices_list = choices_list;
    }

    @Override
    public int getCount() {
        return choices_list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView choicesName;
        View view = convertView;

        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_choices_layout, parent, false);


        //Set on click listeners on the game choices. Each game is a different activity
        view.setOnClickListener(v -> {

            if(position == 0){
            Intent intent = new Intent(v.getContext(),DifficultyActivity.class);
            v.getContext().startActivity(intent);

            }else if (position == 1){
                Intent intent = new Intent(v.getContext(),TextGameActivity_TODO.class);
                v.getContext().startActivity(intent);

            }else if (position == 2){
                Intent intent = new Intent(v.getContext(),AudioGameActivity_TODO.class);
                v.getContext().startActivity(intent);

            }

        });

        choicesName = view.findViewById(R.id.ChoicesName);

        choicesName.setText(choices_list.get(position).getName());

        return view;

    }
}
