import { AppPage } from './app.po';

describe('workspace-project App', () => {
  let page: AppPage;

  beforeEach(() => {
    page = new AppPage();
  });

  it('should display header', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to Matchmaker');
  });
 
  it('should display PI title', () => {
    page.navigateTo();
    expect(page.getCardTitle()).toEqual('Personal Information');
  });  

});
