import React, { useEffect, useState } from 'react';
import CardItem from './CardItem';
import './Card.css';

function Card() {
    const [cardsData, setCardsData] = useState([]);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await fetch('http://localhost:8080/boardgame/popular');
                const data = await response.json();
                setCardsData(data);
            } catch (error) {
                console.error('Error fetching data:', error);
            }
        };

        fetchData();
    }, []);

    const displayedTopCards = cardsData.slice(0, 2);
    const displayedBottomCards = cardsData.slice(2, 5);

    const removeHtmlTags = (htmlString) => {
        const regex = /(<([^>]+)>)/gi;
        return htmlString.replace(regex, '');
    };

    return (
        <div className='cards'>
            <h1>Check out these most popular games!</h1>
            <div className='cards__container'>
                <div className='cards__wrapper'>
                    <ul className='cards__items'>
                        {displayedTopCards.map((card, index) => {
                            const firstSentence = removeHtmlTags(card.description).split('.')[0] + ".";
                            return (
                                <CardItem
                                    key={index}
                                    src={card.image_url}
                                    text={firstSentence}
                                    label={Math.round(card.average_user_rating * 10) / 10 + ' ★'}
                                    path='/'
                                />
                            );
                        })}
                    </ul>
                    <ul className='cards__items'>
                        {displayedBottomCards.map((card, index) => {
                            const firstSentence = removeHtmlTags(card.description).split('.')[0] + ".";
                            return (
                                <CardItem
                                    key={index}
                                    src={card.image_url}
                                    text={firstSentence}
                                    label={Math.round(card.average_user_rating * 10) / 10 + ' ★'}
                                    path='/'
                                />
                            );
                        })}
                    </ul>
                </div>
            </div>
        </div>
    );
}

export default Card;
