# Extension Validation Report

- Extension: tachiyomi-en.paritehaber-v1.4.53
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
- Source theme: madaralegacy
- Source ID: 3740623306758763677
- Source name: Paritehaber
- Source language: en
- Selected manga input: latest offset 0: Devoured: The Serpent and the Pomegranate (`.../devoured-the-serpent-and-the-pomegranate`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Cuntboy Wives (`.../cuntboy-wives`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Red Candy (`.../red-candy`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Devoured: The Serpent and the Pomegranate (`.../devoured-the-serpent-and-the-pomegranate`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | I became a first-class guide thanks to my childhood friends (`.../i-became-a-first-class-guide-thanks-to-my-childhood-friends`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Devoured: The Serpent and the Pomegranate (`.../devoured-the-serpent-and-the-pomegranate`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Devoured: The Serpent and the Pomegranate (`.../devoured-the-serpent-and-the-pomegranate`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 32 | no 0001. Prologue (`https://www.paritehaber.com/.../no-0001-prologue`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 99 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Devoured: The Serpent and the Pomegranate, URL=`.../devoured-the-serpent-and-the-pomegranate` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.paritehaber.com/.../1985d2af71163f7eeefaf7ef010d4ae7-193x278.jpg` (image/jpeg, 17926 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../devoured-the-serpent-and-the-pomegranate` |  |  |  |
| details thumbnail URL | PASS | `https://www.paritehaber.com/.../1985d2af71163f7eeefaf7ef010d4ae7-193x278.jpg` |  |  |  |
| details author | PASS | Gamjajeon |  |  |  |
| details artist | PASS | Gamjajeon |  |  |  |
| details genres | PASS | Adaptation, Adult, Drama, Fantasy, Full Color, harem, Historical, Magic, Manhwa, Mature, Monsters, Romance, Royalty, Smut, Supernatural, Violence, Webtoon, Yaoi(BL) |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | In the blessed land of Trastasa, Na-in is the cherished companion of Amon, the great and omnipotent god. Though Amon treats him with apparent tenderness, his cruel and indifferent ways haunt Na-in’s every moment. When a striking servant with rare pink features called Rhan Gwen arrives, Na-in expects to lose Amon’s attention. Instead, he discovers something unsettling… Rhan Gwen shows no interest in Amon, only in Na-in himself. As this mysterious yet beautiful man offers the gentle understanding Na-in has always craved, he faces an impossible choice between familiar darkness and uncertain warmth.<br><br>Alternative Names: The Snake That Swallowed the Pomegranate / La serpiente que mordió una granada / The Snake That Swallowed a Pomegranate / Змея, проглотившая гранат / 吞石榴的蛇 / 석류를 삼킨 뱀 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 32 chapters |  |  |  |
| chapter dates | PASS | 32 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 32 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 99 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.paritehaber.com/.../001.jpg` (image/jpeg, 210499 bytes, 1280x2400) |  |  |  |
