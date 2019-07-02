import React, { Component } from 'react';
import './App.scss';
class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
          isLoaded: false,
          WordList: [
            {'key':'0', 'word':'Buzzy'},
            {'key':'1', 'word':'Stan'},
            {'key':'2', 'word':'On-Brand'},
            {'key':'3', 'word':'Swole'},
            {'key':'4', 'word':'Communism'},
            {'key':'5', 'word':'Unplug'},
            {'key':'6', 'word':'Patriot'},
            {'key':'7', 'word':'EGOT'},
            {'key':'8', 'word':'Socialism'},
            {'key':'9', 'word':'Cheesemonger'},
            {'key':'10', 'word':'Headwind'},
            {'key':'11', 'word':'Oche'},
            {'key':'12', 'word':'Detectorist'},
            {'key':'13', 'word':'Paleontologist'},
            {'key':'14', 'word':'Capitalism'}
          ],
          currentWord: {},
          selectedWordIndex: ''
        };
    }

    getDictionaryData(word) {
      const self = this;
      fetch("https://googledictionaryapi.eu-gb.mybluemix.net/?define="+word.word).then(response => {
          return response.json();
      }).then(jsonResponse => {
        console.log('jsonResponse ', jsonResponse);
        let definition = '';
        for (var key in jsonResponse[0].meaning) {
          if (jsonResponse[0].meaning[key]) {
            definition = jsonResponse[0].meaning[key][0];
            console.log('definition ', definition);
          }
        }
        self.setState({currentWord: definition});
        self.setState({selectedWordIndex: word.key});
        console.log('selectedWordIndex ', self.state.selectedWordIndex);
      });
    }

    clearData() {
      this.setState({currentWord: {}, selectedWordIndex: ''});
    }

    render() {
        if(this.state.WordList.length > 0) {
            return (
              <div className="fx-root">
                <h1>Click on any word to know its meaning</h1>
                <div className="words-container">
                  <div className="word-list">
                    {this.state.WordList.map(word => (
                      <div key={word.key} className={"words " + (this.state.selectedWordIndex === word.key ? 'active' : '')}
                       onClick={this.getDictionaryData.bind(this, word)}>
                       {word.word}
                      </div>
                    ))}
                  </div>
                  {this.state.currentWord.definition ? 
                    <div className="word-details">
                      <div className="word-definition">
                        <span>Definition</span> - <span>{this.state.currentWord.definition}</span>
                      </div>
                      <div className="word-example">
                        <span>Example</span> - <span>{this.state.currentWord.example}</span>
                      </div>
                      <div className="button-container">
                        <button onClick={this.clearData.bind(this)}>Clear</button>
                      </div>
                    </div>
                    : ''
                  }
                </div>
              </div>
            );
        } else {
            return (<div>Loading</div>);
        }
    }
}
export default App;