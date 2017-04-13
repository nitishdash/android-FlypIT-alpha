package com.dashapps.nitish.flypitalpha1;

/**
 * Created by Nitish on 6/3/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<ModelClass> dataset;

    public static final String TITLE="com.dashapps.nitish.wpgetjs.TITLE";
    public static final String EXTRA_MESSAGE="com.dashapps.nitish.wpgetjs.DATA";
    public static final String ATTACHMENTS="com.dashapps.nitish.wpgetjs.ATTACHMENTS";
    public static final String POSITION="com.dashapps.nitish.wpgetjs.POSITION";


    TextView name;
    private int position;
    public DataAdapter(ArrayList<ModelClass> dataset) {
        this.dataset = dataset;
    }



    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }


    //this function will perform tasks when the data is being bound to each card
    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_postname.setText(Html.fromHtml(dataset.get(i).getTitle()));
        viewHolder.tv_excerpt.setText(Html.fromHtml(dataset.get(i).getExcerpt()));
        position = viewHolder.getLayoutPosition();



    }


    @Override
    public int getItemCount() {
        return dataset.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_postname,tv_excerpt;

        public ViewHolder(View view) {
            super(view);

            tv_postname = (TextView)view.findViewById(R.id.tv_postname);
            tv_excerpt = (TextView)view.findViewById(R.id.tv_excerpt);
            Typeface content = Typeface.createFromAsset(view.getContext().getAssets(),view.getContext().getString(R.string.typeface_content));

            Typeface title = Typeface.createFromAsset(view.getContext().getAssets(),view.getContext().getString(R.string.typeface_title));


            tv_postname.setTypeface(content);
            tv_postname.setTypeface(title);

            tv_excerpt.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Log.i("EXCERPT Item Position", String.valueOf(getLayoutPosition()));
                    Intent intent = new Intent(view.getContext(), Main2Activity.class);
                    String message = dataset.get(getLayoutPosition()).getContent();
                    String title = dataset.get(getLayoutPosition()).getTitle();
                   // ArrayList attachments = dataset.get(getLayoutPosition()).getAttachments();
                   // String urls = dataset.get(getLayoutPosition()).getAttachments().get(0).toString();
                    //Toast toast = Toast.makeText(view.getContext(),urls+"",Toast.LENGTH_SHORT);
                    //toast.show();
                    intent.putExtra(EXTRA_MESSAGE, message);
                    intent.putExtra(TITLE, title);
                    //getting the image url out of the attachments arraylist


   //
                   Toast.makeText(view.getContext(), dataset.get(getLayoutPosition()).getAttachments().size()+"", Toast.LENGTH_LONG).show();

                if(dataset.get(getLayoutPosition()).getAttachments().size()==0){

                        Toast toast = Toast.makeText(view.getContext(), "WILL LOAD DEFAULT IMAGE", Toast.LENGTH_LONG);

                        toast.show();

                        intent.putExtra(ATTACHMENTS, "http://flypit.16mb.com/wp-content/uploads/2016/06/default.jpg");

                    }

                    else
                    {
                        String imageURL = dataset.get(getLayoutPosition()).getAttachments().get(0).getUrl();

                        Toast toast = Toast.makeText(view.getContext(), imageURL, Toast.LENGTH_LONG);

                        toast.show();

                        intent.putExtra(ATTACHMENTS, imageURL);

                    }


//                    String abc1 = dataset.get(getLayoutPosition()).getAttachments().get(0).getImages().getFull().toString();



                    view.getContext().startActivity(intent);


                  //  ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(intent, view, );
                  //  ActivityCompat.startActivity(DataAdapter.this.get, intent, options.toBundle());
                    // ViewModel viewModel;
                   // Main2Activity.navigate(this, view.findViewById(R.id.image), viewModel);
                }

            });

            tv_postname.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Log.i("title Item Position", String.valueOf(getLayoutPosition()));
                    Intent intent = new Intent(view.getContext(), Main2Activity.class);
                    String message = dataset.get(getLayoutPosition()).getContent();
                    String title = dataset.get(getLayoutPosition()).getTitle();
                    intent.putExtra(EXTRA_MESSAGE, message);
                    intent.putExtra(TITLE, title);
                    view.getContext().startActivity(intent);
                }

            });

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i("RecyclerView Position", String.valueOf(getLayoutPosition()));
                    Intent intent = new Intent(view.getContext(), Main2Activity.class);
                    String message = dataset.get(getLayoutPosition()).getContent();
                    String title = dataset.get(getLayoutPosition()).getTitle();
                    intent.putExtra(EXTRA_MESSAGE, message);
                    intent.putExtra(TITLE, title);
                    view.getContext().startActivity(intent);
                }
            });

        }
    }

    public interface MyClickListener {
        public void onItemClick(int position, View v);

    }


}
