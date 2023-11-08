import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.cardview.widget.CardView
import com.example.simplegmail.MessageModel
import com.example.simplegmail.R

class MessageAdapter(val messages: ArrayList<MessageModel>) :
    RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contentTextView: TextView = itemView.findViewById(R.id.content)
        val noteTextView: TextView = itemView.findViewById(R.id.wap_note)
        val userNameTextView: TextView = itemView.findViewById(R.id.text_user_name)
        val timeTextView: TextView = itemView.findViewById(R.id.time)
        val cardView: CardView = itemView.findViewById(R.id.card_view_2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.message_item, parent, false)
        return MessageViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]

        holder.contentTextView.text = message.content
        holder.noteTextView.text = message.ownerName
        holder.userNameTextView.text = message.ownerName[0].toString()
        holder.timeTextView.text = message.time

        val backgroundColors = listOf("#5a99fa", "#fb8c67", "#9acd68", "#92a3ad", "#8C33FF")
        val color = Color.parseColor(backgroundColors[position % backgroundColors.size])
        holder.cardView.setCardBackgroundColor(color)
    }

    override fun getItemCount(): Int {
        return messages.size
    }
}
