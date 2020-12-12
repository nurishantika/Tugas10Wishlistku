package com.example.wishlistku

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class NoteViewModel(application: Application) : AndroidViewModel(application)
{
    private var repository: wishlist.NoteRepository =
        wishlist.NoteRepository(application)
    private var allNotes: LiveData<List<wishlist.Note>> = repository.getAllNotes()
    fun insert(note: wishlist.Note) {
        repository.insert(note)
    }
    fun update(note: wishlist.Note) {
        repository.update(note)
    }
    fun delete(note: wishlist.Note) {
        repository.delete(note)
    }
    fun deleteAllNotes() {
        repository.deleteAllNotes()
    }
    fun getAllNotes(): LiveData<List<wishlist.Note>> {
        return allNotes
    }
}