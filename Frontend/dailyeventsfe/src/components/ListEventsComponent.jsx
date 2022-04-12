import React, { Component } from 'react'
import EventService from '../services/EventService'

export default class ListEventsComponent extends Component {

    constructor(props){
        super(props)
        this.state={
            events:[]

        }
    }

    componentDidMount(){
        EventService.getEvents().then((res) => {
            this.setState({
                events: res.data
            });
            console.log(this.state);
        })
    }
  render() {
      console.log(this.state.events)
      const rows = [];
    return (
        
      <div>
          <h2 className='text-center'>Events List</h2>
          <div className='row'>
              <table >
                  <thead>
                      <tr>
                          <th>Restaurant</th>
                      </tr>
                  </thead>
                  <tbody>
                      {
                          
                        //   this.props.events.array.forEach(event => {
                        //       <div>{event.restaurantName</div>
                        //   });
                          this.state.events.map(
                              event => 
                              <tr key={event.restaurantName}>
                                  <td >{ event.restaurantName}</td>
                                  

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
