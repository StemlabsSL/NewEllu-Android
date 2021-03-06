// Generated by view binder compiler. Do not edit!
package com.stemlabs.ellu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.stemlabs.ellu.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentEditSosPagerContactBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgRadioButton;

  @NonNull
  public final CircleImageView imgSelectAllContact;

  @NonNull
  public final LinearLayout llSelectAllContact;

  @NonNull
  public final RecyclerView rvEditContact;

  @NonNull
  public final TextView tvSaveChangesLBL;

  @NonNull
  public final TextView tvSelectAllContacts;

  private FragmentEditSosPagerContactBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView imgRadioButton, @NonNull CircleImageView imgSelectAllContact,
      @NonNull LinearLayout llSelectAllContact, @NonNull RecyclerView rvEditContact,
      @NonNull TextView tvSaveChangesLBL, @NonNull TextView tvSelectAllContacts) {
    this.rootView = rootView;
    this.imgRadioButton = imgRadioButton;
    this.imgSelectAllContact = imgSelectAllContact;
    this.llSelectAllContact = llSelectAllContact;
    this.rvEditContact = rvEditContact;
    this.tvSaveChangesLBL = tvSaveChangesLBL;
    this.tvSelectAllContacts = tvSelectAllContacts;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEditSosPagerContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEditSosPagerContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_edit_sos_pager_contact, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEditSosPagerContactBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgRadioButton;
      ImageView imgRadioButton = rootView.findViewById(id);
      if (imgRadioButton == null) {
        break missingId;
      }

      id = R.id.imgSelectAllContact;
      CircleImageView imgSelectAllContact = rootView.findViewById(id);
      if (imgSelectAllContact == null) {
        break missingId;
      }

      id = R.id.llSelectAllContact;
      LinearLayout llSelectAllContact = rootView.findViewById(id);
      if (llSelectAllContact == null) {
        break missingId;
      }

      id = R.id.rvEditContact;
      RecyclerView rvEditContact = rootView.findViewById(id);
      if (rvEditContact == null) {
        break missingId;
      }

      id = R.id.tvSaveChangesLBL;
      TextView tvSaveChangesLBL = rootView.findViewById(id);
      if (tvSaveChangesLBL == null) {
        break missingId;
      }

      id = R.id.tvSelectAllContacts;
      TextView tvSelectAllContacts = rootView.findViewById(id);
      if (tvSelectAllContacts == null) {
        break missingId;
      }

      return new FragmentEditSosPagerContactBinding((LinearLayout) rootView, imgRadioButton,
          imgSelectAllContact, llSelectAllContact, rvEditContact, tvSaveChangesLBL,
          tvSelectAllContacts);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
