package `in`.blogspot.naufal.githubapiprofile

import `in`.blogspot.naufal.githubapiprofile.databinding.RecycleviewrowBinding
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private var context : Context, private var userlist: List<Users>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var recycleviewrowBinding: RecycleviewrowBinding =DataBindingUtil.inflate(LayoutInflater.from(parent.context),
            R.layout.recycleviewrow,parent,false)
        var myViewHolder: MyViewHolder= MyViewHolder(recycleviewrowBinding)
        return myViewHolder
    }

    class MyViewHolder(itemView: RecycleviewrowBinding) : RecyclerView.ViewHolder(itemView.root) {
        var recycleviewrowBinding: RecycleviewrowBinding=itemView;
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var temp: Users=userlist.get(position)
        holder.recycleviewrowBinding.user=temp
        holder.recycleviewrowBinding.executePendingBindings()
    }

    override fun getItemCount(): Int {
        return userlist.size;
    }
}