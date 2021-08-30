<?xml version="1.0" encoding="utf-8"?>
<ScrollView android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:android="http://schemas.android.com/apk/res/android" >


<LinearLayout
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".RegisterActivity">

<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginTop="16dp"
    android:orientation="vertical">


    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="what's your name ?"
        android:textAlignment="center"
        android:textColor="#000000"
        android:textSize="17sp"
        android:textStyle="bold"
        />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginStart="16dp"
            android:layout_weight="1">

            <com.google.android.material.textfield.TextInputEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="First Name"
                >

            </com.google.android.material.textfield.TextInputEditText>

        </com.google.android.material.textfield.TextInputLayout>


        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginEnd="16dp"
            android:layout_weight="1">

            <com.google.android.material.textfield.TextInputEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Last Name"
                >

            </com.google.android.material.textfield.TextInputEditText>

        </com.google.android.material.textfield.TextInputLayout>

    </LinearLayout>
</LinearLayout>



    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:orientation="vertical">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="what's your  Email address ?"
            android:textAlignment="center"
            android:textColor="#000000"
            android:textSize="17sp"
            android:textStyle="bold" />

        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="16dp"
            android:layout_marginEnd="16dp">
            <com.google.android.material.textfield.TextInputEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Email Address"
                android:inputType="textEmailAddress">

            </com.google.android.material.textfield.TextInputEditText>

        </com.google.android.material.textfield.TextInputLayout>

    </LinearLayout>


    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:orientation="vertical">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="what's your  Password ?"
            android:textAlignment="center"
            android:textColor="#000000"
            android:textSize="17sp"
            android:textStyle="bold"
            />

        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="16dp"
            android:layout_marginEnd="16dp">

            <com.google.android.material.textfield.TextInputEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Password"
                android:inputType="textPassword">


            </com.google.android.material.textfield.TextInputEditText>

        </com.google.android.material.textfield.TextInputLayout>

    </LinearLayout>



    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:orientation="vertical">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="what's your Phone Number ?"
            android:textAlignment="center"
            android:textColor="#000000"
            android:textSize="17sp"
            android:textStyle="bold"
            />

        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="16dp"
            android:layout_marginEnd="16dp">

            <com.google.android.material.textfield.TextInputEditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Phone number"
                android:inputType="phone">


            </com.google.android.material.textfield.TextInputEditText>

        </com.google.android.material.textfield.TextInputLayout>


        <LinearLayout
            android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1.5"
        android:layout_marginTop="16dp"
        android:layout_marginStart="16dp"
        android:layout_marginEnd="16dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="what's your Date Of Birth ?"
            android:textAlignment="center"
            android:textColor="#000000"
            android:textSize="17sp"
            android:textStyle="bold"
            />
          <DatePicker
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:calendarViewShown="false"
            android:datePickerMode="spinner"
            android:forceDarkAllowed="true"
            android:layout_marginStart="16dp"
            android:layout_marginEnd="16dp"
            android:yearListSelectorColor="#FFFFFF"
            >
          </DatePicker>
        </LinearLayout>
    </LinearLayout>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="16dp"
        android:background="@drawable/btn"
        android:textColor="#FFFFFF"
        android:text="Sign up"
        android:textAllCaps="false"
        android:textSize="18sp"
        />
    </LinearLayout>
</ScrollView>
