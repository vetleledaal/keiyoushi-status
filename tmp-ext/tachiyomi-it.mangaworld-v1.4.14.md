# Extension Validation Report

- Extension: tachiyomi-it.mangaworld-v1.4.14
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangaworld
- Source ID: 7114846210461894145
- Source name: Mangaworld
- Source language: it
- Selected manga input: latest offset 0: A Questionnaire on the Mouth (`.../a-questionnaire-on-the-mouth`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | One Piece (`.../one-piece`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 16 | Naruto (`.../naruto`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 16 | A Questionnaire on the Mouth (`.../a-questionnaire-on-the-mouth`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | Goblin Inc. (`.../goblin-inc`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | A Questionnaire on the Mouth (`.../a-questionnaire-on-the-mouth`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | A Questionnaire on the Mouth (`.../a-questionnaire-on-the-mouth`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capitolo 01 (`.../6aa174599a07245e970c58d5 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 49 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Questionnaire on the Mouth, URL=`.../a-questionnaire-on-the-mouth` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangaworld.mx/.../6aa17464254ad05ee467ebd8.jpg <redacted query values: 1788966021265>` (image/jpeg, 730226 bytes, 1440x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-questionnaire-on-the-mouth` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.mangaworld.mx/.../6aa17418a8369e246e5e97bf.jpg <redacted query values: 1788965945368>` (image/jpeg, 730226 bytes, 1440x2048) |  |  |  |
| details author | PASS | Sesuji |  |  |  |
| details artist | PASS | OSHIMI Shuzo |  |  |  |
| details genres | PASS | Drammatico, Horror, Shounen |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | La storia segue un gruppo di sei studenti universitari, tra cui Shota Murai, che decidono di visitare un luogo ritenuto infestato all'interno di un cimitero dove si dice si trovi un albero maledetto. Dopo quella visita la vita dei ragazzi cambia drasticamente poiché il giorno seguente uno di loro scompare nel nulla e il resto del gruppo inizia a essere perseguitato da eventi inspiegabili e terrificanti che li spingono gradualmente verso la follia. La narrazione si concentra sul mistero di ciò che è realmente accaduto durante quella notte al cimitero mentre i sopravvissuti vengono braccati da una forza oscura legata alla sinistra leggenda locale.<br><br>Titoli alternativi: Kuchi ni Kansuru Anketo, 口に関するアンケート, Kuchi ni Kansuru Enquête |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.mangaworld.mx/.../1.jpg` (image/jpeg, 401850 bytes, 669x1102) |  |  |  |
