package com.viethoa.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.viethoa.R;
import com.viethoa.models.AlphabetItem;

import java.util.List;

/**
 * Created by VietHoa on 02/10/15.
 */
public class AlphabetAdapter extends RecyclerView.Adapter<AlphabetAdapter.ViewHolder> {
    private Context mContext;
    private List<AlphabetItem> mDataArray;
    private OnItemClickListener listener;

    public AlphabetAdapter(Context context, List<AlphabetItem> dataSet) {
        this.mContext = context;
        this.mDataArray = dataSet;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public void refreshDataChange(List<AlphabetItem> newDataSet) {
        this.mDataArray = newDataSet;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mDataArray == null)
            return 0;
        return mDataArray.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View alphabet = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_alphabet_layout, parent, false);
        return new ViewHolder(alphabet);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(mDataArray.get(position), position);
    }

    public interface OnItemClickListener {
        void OnItemClicked(int alphabetPosition, int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvWord;
        TextView fastscroller_bubble;
        ImageView fastscroller_handle;
        RelativeLayout rl_bubble;

        public ViewHolder(View itemView) {
            super(itemView);
            tvWord = (TextView) itemView.findViewById(R.id.tv_word);
            fastscroller_bubble = (TextView) itemView.findViewById(R.id.fastscroller_bubble);
            fastscroller_handle = (ImageView) itemView.findViewById(R.id.fastscroller_handle);
            rl_bubble = (RelativeLayout) itemView.findViewById(R.id.rl_bubble);
        }

        public void bind(final AlphabetItem alphabetItem, final int position) {
            if (alphabetItem == null || alphabetItem.word == null)
                return;

            // Text
            tvWord.setText(alphabetItem.word);

            // Style
            tvWord.setTypeface(null, alphabetItem.isActive ? Typeface.BOLD : Typeface.NORMAL);
            // Text color
            tvWord.setTextColor(alphabetItem.isActive
                    ? mContext.getResources().getColor(R.color.primary_color)
                    : mContext.getResources().getColor(R.color.black));
            // Click event
            tvWord.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener == null) {
                        return;
                    }

                    listener.OnItemClicked(alphabetItem.position, position);
                }
            });

            if(alphabetItem.isActive){
                fastscroller_bubble.setText(alphabetItem.word);
                fastscroller_bubble.setVisibility(View.VISIBLE);
                fastscroller_handle.setVisibility(View.GONE);
                rl_bubble.setVisibility(View.VISIBLE);
            }else{
                fastscroller_bubble.setVisibility(View.INVISIBLE);
                fastscroller_handle.setVisibility(View.GONE);
                rl_bubble.setVisibility(View.INVISIBLE);
            }



        }
    }
}
