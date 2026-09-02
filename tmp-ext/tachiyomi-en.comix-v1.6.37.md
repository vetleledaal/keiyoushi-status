# Extension Validation Report

- Extension: tachiyomi-en.comix-v1.6.37
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7537715367149829912
- Source name: Comix
- Source language: en
- Selected manga input: popular offset 0: On the Way to Meet Mom (`.../g2rk-on-the-way-to-meet-mom`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | On the Way to Meet Mom (`.../g2rk-on-the-way-to-meet-mom`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 28 | Olgami (`.../5n07-olgami`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | My Fake Girlfriend's Defending Against Their Attacks (`.../qdjd9-my-fake-girlfriends-defending-against-their-attacks`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 28 | The Eight Empresses Betrayed Me, Only to Deeply Regret It After Being Reborn (`.../5r15m-the-eight-empresses-betrayed-me-only-to-deeply-regret-it-after-being-reborn`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 28 | On the Way to Meet Mom (`.../g2rk-on-the-way-to-meet-mom`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | On the Way to Meet Mom (`.../g2rk-on-the-way-to-meet-mom`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 474 | Chapter 1 (`.../9310151-chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 76 |  |  | <1s |

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
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=On the Way to Meet Mom, URL=`.../g2rk-on-the-way-to-meet-mom` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 140/140 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 140/140 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.comix.to/.../68e1226eaa243.jpg` (image/jpeg, 51883 bytes, 400x600; server Content-Type: image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../g2rk-on-the-way-to-meet-mom` |  |  |  |
| details thumbnail URL | PASS | `https://static.comix.to/.../68e1226eaa243.jpg` |  |  |  |
| details author | PASS | Gomyang |  |  |  |
| details artist | PASS | Gomyang |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Comedy, Fantasy, Sci-Fi, Slice of Life, Shounen |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★★ 9.8<br><br>Mori, a child found by a rescue team in an abandoned house, wakes up in a shelter. While adapting to an unfamiliar life, one day, he begins to be looked after with unconditional love from a mysterious sponsor... And then Mori learns about the existence of a "mom" when a close friend leaves with hers. The child starts to wonder about the sponsor: "Could this person... be my mom?"
<br>This is the story of Mori's long and challenging journey to find his mom.<br><br>Year: 2024<br>Language: KO<br>Content rating: Safe<br>Rank: #352<br>Rated by: 5511<br>Followed by: 42355 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 474 chapters |  |  |  |
| chapter dates | PASS | 474 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 76 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://80pd.wowpic2.store/.../bEqPbYfoOT0Gmw3lMgafoApU4q0VeuKi3R0Vvq7I6y4AjS5FIHyEz7PI11FmpSw` (image/webp (encoding: lossy), 175812 bytes, 1080x2000) |  |  |  |
