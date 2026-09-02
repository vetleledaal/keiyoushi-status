# Extension Validation Report

- Extension: tachiyomi-fr.hentaiorigines-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3875672872924535086
- Source name: Hentai Origines
- Source language: fr
- Selected manga input: popular offset 0: Stop Smoking (`.../stop-smoking`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Stop Smoking (`.../stop-smoking`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | My Sister’s Friends (`.../my-sisters-friends`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | The Meek Cat (`.../the-meek-cat`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Glorious Homecoming (`.../glorious-homecoming`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Stop Smoking (`.../stop-smoking`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Stop Smoking (`.../stop-smoking`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 105 | Chapitre 1 Ch.1 (`.../chapitre-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Stop Smoking, URL=`stop-smoking` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 122/122 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 122/122 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentai-origines.com/.../thumbnail-15-203x300.png` (image/png, 460249 bytes, 540x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `stop-smoking` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://hentai-origines.com/.../thumbnail-15.png` was not downloaded |  |  |  |
| details author | PASS | AA |  |  |  |
| details artist | PASS | Momobird |  |  |  |
| details genres | PASS | Comédie, Drame, Romance, Pornhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Même si je me fais taquiner pour ma petite taille et harceler au travail, ma maison est un paradis !!… C’est ce que je pensais, mais les voisins fument comme des fous !! Je n’en pouvais plus et suis allé les voir, mais je suis tombé sur une gangster à l’air féroce et balèze, Na Se-young !<br><br>Nom alternatif: 담배피지 마세요!, Someone Stop Her!, Jikan Teishi Yuusha - Yomei 3-ka no Settei ja Sekai o Sukuu ni wa Mijika Sugiru, 時間停止勇者　余命３日の設定じゃ世界を救うには短すぎる, Time Stop Hero, 停止时间的勇者⸺只能再活三天这种设定对拯救世界来说未免太短了⸺, 停止時間的勇者⸺只能再活三天這種設定對拯救世界來說未免太短了⸺, Герой, останавливающий время, ผู้กล้าหยุดเวลา, 시간정지용사~수명 3일 설정으로 세계를 구하기엔 너무 짧잖아~ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 105 chapters |  |  |  |
| chapter dates | PASS | 105 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hentai-origines.com/.../001.jpeg` (image/jpeg, 905479 bytes, 1033x1714) |  |  |  |
