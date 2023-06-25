import React from 'react'
import {Button} from "./Button";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import { faArrowRightLong } from '@fortawesome/free-solid-svg-icons';
import '../App.css'
import './Hero.css'

const Hero = () => {
    return (
        <div className='hero-container'>
            <video src="/videos/HomeHero.mp4" autoPlay loop muted />
            <h1>UNITE, PLAY, CONQUER</h1>
            <p>What are you waiting for?</p>
            <div className='hero-btns'>
                <Button className='btns' buttonStyle='btn--outline' buttonSize='btn--large'>
                    GET STARTED
                </Button>
                <Button className='btns' buttonStyle='btn--primary' buttonSize='btn--large'>
                    COLLECTION <FontAwesomeIcon icon={faArrowRightLong} className='btns-arrow'/>
                </Button>
            </div>
        </div>
    )
}
export default Hero
