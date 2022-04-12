import axios from 'axios';

const EVENT_API_BASE_URL = "http://localhost:8089/events/getAll"

class EventService{

    getEvents(){
        return axios.get(EVENT_API_BASE_URL);
    }
}

export default new EventService()