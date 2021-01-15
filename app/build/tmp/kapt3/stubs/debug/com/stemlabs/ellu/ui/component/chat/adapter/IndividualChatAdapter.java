package com.stemlabs.ellu.ui.component.chat.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)*B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001dH\u0016J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001dH\u0016J\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\'\u001a\u00020\u001f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006+"}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/adapter/IndividualChatAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stemlabs/ellu/ui/component/chat/adapter/IndividualChatAdapter$IndividualChatViewHolder;", "arrayList", "", "Lcom/stemlabs/ellu/data/model/IndividualChatModel;", "(Ljava/util/List;)V", "getArrayList", "()Ljava/util/List;", "setArrayList", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "listener", "Lcom/stemlabs/ellu/ui/component/chat/adapter/IndividualChatAdapter$OnChatSelect;", "getListener", "()Lcom/stemlabs/ellu/ui/component/chat/adapter/IndividualChatAdapter$OnChatSelect;", "setListener", "(Lcom/stemlabs/ellu/ui/component/chat/adapter/IndividualChatAdapter$OnChatSelect;)V", "repoModel", "Lcom/stemlabs/ellu/data/RepoModel;", "getRepoModel", "()Lcom/stemlabs/ellu/data/RepoModel;", "setRepoModel", "(Lcom/stemlabs/ellu/data/RepoModel;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setChatListener", "updateList", "chatList", "IndividualChatViewHolder", "OnChatSelect", "app_debug"})
public final class IndividualChatAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.stemlabs.ellu.ui.component.chat.adapter.IndividualChatAdapter.IndividualChatViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.ui.component.chat.adapter.IndividualChatAdapter.OnChatSelect listener;
    @org.jetbrains.annotations.NotNull()
    public com.stemlabs.ellu.data.RepoModel repoModel;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.stemlabs.ellu.data.model.IndividualChatModel> arrayList;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.ui.component.chat.adapter.IndividualChatAdapter.OnChatSelect getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.adapter.IndividualChatAdapter.OnChatSelect p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stemlabs.ellu.data.RepoModel getRepoModel() {
        return null;
    }
    
    public final void setRepoModel(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.RepoModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stemlabs.ellu.ui.component.chat.adapter.IndividualChatAdapter.IndividualChatViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.adapter.IndividualChatAdapter.IndividualChatViewHolder holder, int position) {
    }
    
    public final void setChatListener(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.chat.adapter.IndividualChatAdapter.OnChatSelect listener) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.IndividualChatModel> chatList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stemlabs.ellu.data.model.IndividualChatModel> getArrayList() {
        return null;
    }
    
    public final void setArrayList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.IndividualChatModel> p0) {
    }
    
    public IndividualChatAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stemlabs.ellu.data.model.IndividualChatModel> arrayList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001a\u0010,\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001a\u0010/\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\u001a\u00102\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\u001a\u00105\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\u001a\u0010>\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR\u001a\u0010G\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010A\"\u0004\bI\u0010CR\u001a\u0010J\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010A\"\u0004\bL\u0010CR\u001a\u0010M\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010A\"\u0004\bO\u0010CR\u001a\u0010P\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010A\"\u0004\bR\u0010CR\u001a\u0010S\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010A\"\u0004\bU\u0010CR\u001a\u0010V\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010A\"\u0004\bX\u0010CR\u001a\u0010Y\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010A\"\u0004\b[\u0010CR\u001a\u0010\\\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010A\"\u0004\b^\u0010CR\u001a\u0010_\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010A\"\u0004\ba\u0010C\u00a8\u0006b"}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/adapter/IndividualChatAdapter$IndividualChatViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imgAwareMeetIcon", "Landroid/widget/ImageView;", "getImgAwareMeetIcon", "()Landroid/widget/ImageView;", "setImgAwareMeetIcon", "(Landroid/widget/ImageView;)V", "imgChatReceive", "Lcom/stemlabs/ellu/widgets/RoundRectCornerImageView;", "getImgChatReceive", "()Lcom/stemlabs/ellu/widgets/RoundRectCornerImageView;", "setImgChatReceive", "(Lcom/stemlabs/ellu/widgets/RoundRectCornerImageView;)V", "imgChatSend", "getImgChatSend", "setImgChatSend", "imgMap", "getImgMap", "setImgMap", "imgPlayReceive", "getImgPlayReceive", "setImgPlayReceive", "imgPlaySend", "getImgPlaySend", "setImgPlaySend", "imgProfileReceive", "Lde/hdodenhof/circleimageview/CircleImageView;", "getImgProfileReceive", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setImgProfileReceive", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "llAudioReceive", "Landroid/widget/LinearLayout;", "getLlAudioReceive", "()Landroid/widget/LinearLayout;", "setLlAudioReceive", "(Landroid/widget/LinearLayout;)V", "llAudioSend", "getLlAudioSend", "setLlAudioSend", "llAwareMeetView", "getLlAwareMeetView", "setLlAwareMeetView", "llContact", "getLlContact", "setLlContact", "llProximityView", "getLlProximityView", "setLlProximityView", "rlReceiver", "Landroid/widget/FrameLayout;", "getRlReceiver", "()Landroid/widget/FrameLayout;", "setRlReceiver", "(Landroid/widget/FrameLayout;)V", "rlSend", "getRlSend", "setRlSend", "tvAcceptProximity", "Landroid/widget/TextView;", "getTvAcceptProximity", "()Landroid/widget/TextView;", "setTvAcceptProximity", "(Landroid/widget/TextView;)V", "tvAddContact", "getTvAddContact", "setTvAddContact", "tvAwareMeetTitle", "getTvAwareMeetTitle", "setTvAwareMeetTitle", "tvMessageReceive", "getTvMessageReceive", "setTvMessageReceive", "tvMessageSend", "getTvMessageSend", "setTvMessageSend", "tvProximityMessage", "getTvProximityMessage", "setTvProximityMessage", "tvTimeReceive", "getTvTimeReceive", "setTvTimeReceive", "tvTimeReceiveAudio", "getTvTimeReceiveAudio", "setTvTimeReceiveAudio", "tvTimeSend", "getTvTimeSend", "setTvTimeSend", "tvUserNameReceive", "getTvUserNameReceive", "setTvUserNameReceive", "tvUserNameSend", "getTvUserNameSend", "setTvUserNameSend", "app_debug"})
    public static final class IndividualChatViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.FrameLayout rlReceiver;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvMessageReceive;
        @org.jetbrains.annotations.NotNull()
        private de.hdodenhof.circleimageview.CircleImageView imgProfileReceive;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvUserNameReceive;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvTimeReceive;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvTimeReceiveAudio;
        @org.jetbrains.annotations.NotNull()
        private android.widget.FrameLayout rlSend;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvMessageSend;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvUserNameSend;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvTimeSend;
        @org.jetbrains.annotations.NotNull()
        private com.stemlabs.ellu.widgets.RoundRectCornerImageView imgChatReceive;
        @org.jetbrains.annotations.NotNull()
        private com.stemlabs.ellu.widgets.RoundRectCornerImageView imgChatSend;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llAudioSend;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llAudioReceive;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgPlaySend;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgPlayReceive;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llProximityView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llAwareMeetView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvAddContact;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgAwareMeetIcon;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvAwareMeetTitle;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvAcceptProximity;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvProximityMessage;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgMap;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llContact;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.FrameLayout getRlReceiver() {
            return null;
        }
        
        public final void setRlReceiver(@org.jetbrains.annotations.NotNull()
        android.widget.FrameLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvMessageReceive() {
            return null;
        }
        
        public final void setTvMessageReceive(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final de.hdodenhof.circleimageview.CircleImageView getImgProfileReceive() {
            return null;
        }
        
        public final void setImgProfileReceive(@org.jetbrains.annotations.NotNull()
        de.hdodenhof.circleimageview.CircleImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvUserNameReceive() {
            return null;
        }
        
        public final void setTvUserNameReceive(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvTimeReceive() {
            return null;
        }
        
        public final void setTvTimeReceive(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvTimeReceiveAudio() {
            return null;
        }
        
        public final void setTvTimeReceiveAudio(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.FrameLayout getRlSend() {
            return null;
        }
        
        public final void setRlSend(@org.jetbrains.annotations.NotNull()
        android.widget.FrameLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvMessageSend() {
            return null;
        }
        
        public final void setTvMessageSend(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvUserNameSend() {
            return null;
        }
        
        public final void setTvUserNameSend(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvTimeSend() {
            return null;
        }
        
        public final void setTvTimeSend(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stemlabs.ellu.widgets.RoundRectCornerImageView getImgChatReceive() {
            return null;
        }
        
        public final void setImgChatReceive(@org.jetbrains.annotations.NotNull()
        com.stemlabs.ellu.widgets.RoundRectCornerImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stemlabs.ellu.widgets.RoundRectCornerImageView getImgChatSend() {
            return null;
        }
        
        public final void setImgChatSend(@org.jetbrains.annotations.NotNull()
        com.stemlabs.ellu.widgets.RoundRectCornerImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlAudioSend() {
            return null;
        }
        
        public final void setLlAudioSend(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlAudioReceive() {
            return null;
        }
        
        public final void setLlAudioReceive(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgPlaySend() {
            return null;
        }
        
        public final void setImgPlaySend(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgPlayReceive() {
            return null;
        }
        
        public final void setImgPlayReceive(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlProximityView() {
            return null;
        }
        
        public final void setLlProximityView(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlAwareMeetView() {
            return null;
        }
        
        public final void setLlAwareMeetView(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvAddContact() {
            return null;
        }
        
        public final void setTvAddContact(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgAwareMeetIcon() {
            return null;
        }
        
        public final void setImgAwareMeetIcon(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvAwareMeetTitle() {
            return null;
        }
        
        public final void setTvAwareMeetTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvAcceptProximity() {
            return null;
        }
        
        public final void setTvAcceptProximity(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvProximityMessage() {
            return null;
        }
        
        public final void setTvProximityMessage(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgMap() {
            return null;
        }
        
        public final void setImgMap(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlContact() {
            return null;
        }
        
        public final void setLlContact(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        public IndividualChatViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stemlabs/ellu/ui/component/chat/adapter/IndividualChatAdapter$OnChatSelect;", "", "getChatAt", "", "position", "", "app_debug"})
    public static abstract interface OnChatSelect {
        
        public abstract void getChatAt(int position);
    }
}