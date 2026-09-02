# Extension Validation Report

- Extension: tachiyomi-fr.ortegascans-v1.6.3
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
- Source ID: 8598370605081191622
- Source name: Ortega Scans
- Source language: fr
- Selected manga input: popular offset 0: OpenTalk (`.../opentalk`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | OpenTalk (`.../opentalk`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | The Father-In-Law Fucks Them All (`.../the-father-in-law-fucks-them-all`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | I Live With A Teacher ! (`.../i-live-with-a-teacher`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Locked Up (`.../locked-up`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | OpenTalk (`.../opentalk`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | OpenTalk (`.../opentalk`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 33 | Chapitre 1 (`.../cm7zu6t7300ury1rnac5wzhhi`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=OpenTalk, URL=`opentalk` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ortegascans.fr/.../opentalk.webp` (image/webp (encoding: lossy), 37516 bytes, 672x876) |  |  |  |
| details identity | PASS | Details preserved selected URL `opentalk` |  |  |  |
| details thumbnail URL | PASS | `https://ortegascans.fr/.../opentalk.webp` |  |  |  |
| details author | PASS | Rubung |  |  |  |
| details artist | PASS | Rubung |  |  |  |
| details genres | PASS | Romance, Drame, Partenaire |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Taeyang est un jeune homme qui se méfie de l’amour à cause d’une relation douloureuse qu’il a eue dans le passé. La vie de Hahyeon a été pleine de malentendus et de préjugés, tout simplement parce qu’elle est une auteure de webtoon pour adultes. Les deux se rencontrent par hasard lors d’une réunion OpenTalk. Une fois, leur première rencontre terminée, ils passent la nuit ensemble. Cependant, la beauté de Ha-Hyeon se répand dans tout OpenTalk, attirant tous ceux qui la regardent avec des intentions cachées et perverses… « Je ne peux rien dire… Si je disais quelque chose sans y réfléchir, ils sauraient que je suis tellement excitée ! »<br><br>Noms alternatifs : Open Talk, 오픈톡 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 33 chapters |  |  |  |
| chapter dates | PASS | 33 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ortegascans.fr/.../1.png` (image/png, 750302 bytes, 1890x1417) |  |  |  |
