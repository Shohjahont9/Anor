package com.example.anor.ui.mainFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.anor.network.response.characters.CharacterResponse
import com.example.anor.network.response.episode.EpisodeResponse
import com.example.anor.network.response.location.LocationResponse
import com.example.anor.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MainRepository
) : ViewModel() {

    private val _getCharacters = MutableLiveData<Resource<CharacterResponse>>()
    val getCharacter:LiveData<Resource<CharacterResponse>> = _getCharacters

    fun characters(id:Int) = viewModelScope.launch {
        _getCharacters.value = Resource.loading(null)
        try {
            _getCharacters.value = Resource.success(repository.getCharacters(id))
        }catch (e:Exception){
            println("getCharacter-> error -> ${e.message}")
        }
    }


    private val _getLocation = MutableLiveData<Resource<LocationResponse>>()
    val getLocation:LiveData<Resource<LocationResponse>> = _getLocation

    fun locations(id:Int) = viewModelScope.launch {
        _getLocation.value = Resource.loading(null)
        try {
            _getLocation.value = Resource.success(repository.getLocation(id))
        }catch (e:Exception){
            println("getLocation-> error -> ${e.message}")
        }
    }


    private val _getEpisode = MutableLiveData<Resource<EpisodeResponse>>()
    val getEpisode:LiveData<Resource<EpisodeResponse>> = _getEpisode

    fun episodes(id:Int) = viewModelScope.launch {
        _getEpisode.value = Resource.loading(null)
        try {
            _getEpisode.value = Resource.success(repository.getEpisode(id))
        }catch (e:Exception){
            println("getEpisodes-> error -> ${e.message}")
        }
    }



}