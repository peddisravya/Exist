import { ExamRouter1Page } from './app.po';

describe('exam-router1 App', function() {
  let page: ExamRouter1Page;

  beforeEach(() => {
    page = new ExamRouter1Page();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
