<?xml version="1.0" encoding="utf-8"?>

<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:background="#FFFFFF"
        android:orientation="vertical"
        app:layout_constraintBottom_toTopOf="@+id/linearLayout"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <ImageView
            android:layout_width="80dp"
            android:layout_height="0dp"
            android:layout_gravity="center"
            android:layout_margin="16dp"
            android:layout_weight="4"
            android:src="@drawable/fblogo"/>

    </LinearLayout>

    <LinearLayout
        android:id="@+id/linearLayout"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:orientation="vertical"
        android:layout_marginTop="10dp"
        android:background="#FFFFFF"
        android:layout_marginBottom="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="8dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent">

        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="12dp"
            >
            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/username"
                android:inputType="text"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Username or phone number">

            </com.google.android.material.textfield.TextInputEditText>
        </com.google.android.material.textfield.TextInputLayout>
        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="12dp"
            >
            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/password"
                android:inputType="text"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Password">

            </com.google.android.material.textfield.TextInputEditText>
        </com.google.android.material.textfield.TextInputLayout>
        <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="12dp"
            android:textColor="#FFFFFF"
            android:text="Log in"
            android:background="@drawable/btn"/>

        <LinearLayout
            android:layout_marginTop="50dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">


            <View
                android:layout_width="0dp"
                android:layout_height="2dp"
                android:layout_weight="9"
                android:layout_marginStart="16dp"
                android:layout_marginTop="8dp"
                android:background="#000000"/>


            <TextView
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:text="OR"
                android:textAlignment="center"
                android:layout_weight="2"/>


            <View
                android:layout_width="0dp"
                android:layout_height="2dp"
                android:layout_weight="9"
                android:layout_marginTop="8dp"
                android:layout_marginEnd="16dp"
                android:background="#000000"/>
        </LinearLayout>

        <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="50dp"
            android:background="#26A32B"
            android:layout_marginEnd="16dp"
            android:layout_marginStart="16dp"
            android:textAlignment="center"
            android:text="create a new facebook account"
            android:layout_marginBottom="20dp"
            android:textColor="#FFFFFF"/>






    </LinearLayout>


</androidx.constraintlayout.widget.ConstraintLayout>
