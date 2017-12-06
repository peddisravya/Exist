import { ProjTestPage } from './app.po';

describe('proj-test App', function() {
  let page: ProjTestPage;

  beforeEach(() => {
    page = new ProjTestPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
