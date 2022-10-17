import React, { Component } from 'react'
import EventService from '../services/EventService'
import '../CssFiles/ListEventsComponent.css'

export default class ListEventsComponent extends Component {

    constructor(props){
        super(props)
        this.state={
            events:[],
            specialEvents:[],
            combinedEvents:[]

        }
    }
    //event
    //specialEvent
    //bothTogether

    loadEvents(){
        EventService.getEvents().then((res) => {
            this.setState({
                events: res.data
            });
        })
    }

    loadSpecialEvents(){
        EventService.getSpecialEvents().then((resp) =>{
            this.setState({
                specialEvents: resp.data
            });
        })
    }

    componentDidMount(){
        this.loadEvents();
        this.loadSpecialEvents();
        this.setState({combinedEvents: this.loadEvents})
        this.setState({combinedEvents: this.loadSpecialEvents})
    
    }
    expandBox(){
        console.log("in expandBox")
    }


  render() {

    console.log(this.state);
    return (
      <div>
          <h2 className='text-center'>Events List</h2>
          
          
          {
            this.state.events.map(
                event => 
                <div>
                    <div onClick={this.expandBox()}>
                        <h3>{event.restaurantName}</h3>
                        <div>{event.openHours}</div>
                        <div class="hide"> {event.street} {event.city} {event.state} {event.zip}</div>
                    </div>
                </div>
                
            )


        }




          <div className='row'>
              <table >
                  <thead>
                      <tr>
                          <th>Restaurant</th>
                          <th>Special</th>
                      </tr>
                  </thead>
                  <tbody>
                      
                      {
                        this.state.specialEvents.map(
                            specialEvents => 
                            <tr key={specialEvents.hours}>
                                <td>{specialEvents.hours}</td>
                            </tr>
                        )
                      }
                  </tbody>

                  </table>
              </div>
        </div>
    )
  }
}
