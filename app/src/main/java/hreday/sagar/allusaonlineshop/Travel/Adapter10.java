package hreday.sagar.allusaonlineshop.Travel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import hreday.sagar.allusaonlineshop.Fragments.ten;
import hreday.sagar.allusaonlineshop.R;

public class Adapter10 extends RecyclerView.Adapter<Adapter10.ViewHolder> {
    // private static ClickListener clickListener;
    // private static ClickListener clickListener;

    //  private static ClickListener clickListener;

    private static ClickListener clickListener;
   Context context;


    //  private OnNoteListener mNotes;


    List<PojoClass10> list;

    public Adapter10(ten ten, List<PojoClass10> list) {
    }

    public Adapter10(Context context, List<PojoClass10> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.sample, parent, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        // GetData hh=list.get(position);
        //holder.muthor.setText(hh.getData().get());
        PojoClass10 hh = list.get(position);
        //  holder.muthor.setText(hh.getName());
        //Picasso.get().load(hh.getImage()).into(holder.img);
        //   Picasso.get().load(hh.getImage1()).into(holder.iimg1);
        //  Picasso.get().load(hh.getImage2()).into(holder.iimg2);
        Picasso.get().load(hh.getImage()).into(holder.iimg);
        //  holder.ttext1.setText(hh.getHobby1());
        //  holder.ttext2.setText(hh.getHobby2());
        holder.ttext.setText(hh.getHobby());
        // Picasso.get().load(hh.getImage()).into(holder.img);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {


        TextView ttext;
        ImageView iimg;
        //  LinearLayout linearLayoutl;
        //     OnNoteListener onNoteListener;
        //  LinearLayout linearLayout;

        // ImageView img;
        public ViewHolder(View itemView) {
            super(itemView);

            ttext = itemView.findViewById(R.id.bookId);

            iimg = itemView.findViewById(R.id.image);



            itemView.setOnClickListener(this);


        }


        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getAdapterPosition(),v);
        }
    }

    public interface ClickListener {

        void onItemClick(int position, View v);

    }

    public  void setOnItemClickListener(ClickListener clickListener){


        Adapter10.clickListener=clickListener;
    }


}


