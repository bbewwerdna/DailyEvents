import React, { Component} from 'react';
import './App.css';
import ListEventsComponent from './components/ListEventsComponent';
// import ListEventsComponent from './components/ListEventsComponent';

class App extends Component {

  

  render(){
  return (
    <div className='App'>
      
      <ListEventsComponent></ListEventsComponent>
    </div>
  )
  }
}

export default App;
