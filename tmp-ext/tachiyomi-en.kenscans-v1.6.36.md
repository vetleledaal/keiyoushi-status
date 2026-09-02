# Extension Validation Report

- Extension: tachiyomi-en.kenscans-v1.6.36
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
- Source ID: 7831933086917318633
- Source name: Ken Scans
- Source language: en
- Selected manga input: popular offset 0: I've Been Invincible for a Long Time (`.../it-turns-out-that-i-have-been-invincible-for-a-long-time`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | I've Been Invincible for a Long Time (`.../it-turns-out-that-i-have-been-invincible-for-a-long-time`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Jiyujiyo (`.../jiyujiyo`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | I became the stepmother who caused my favorite character to fall into darkness (`.../i-became-the-stepmother-who-caused-my-favorite-character-to-fall-into-darkness`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Men City (`.../men-city`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I've Been Invincible for a Long Time (`.../it-turns-out-that-i-have-been-invincible-for-a-long-time`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I've Been Invincible for a Long Time (`.../it-turns-out-that-i-have-been-invincible-for-a-long-time`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 224 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I've Been Invincible for a Long Time, URL=`it-turns-out-that-i-have-been-invincible-for-a-long-time#44` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.kencomics.com/.../cover_1744394904211.webp` (image/webp (encoding: lossy), 139002 bytes, 500x667) |  |  |  |
| details identity | PASS | Details preserved selected URL `it-turns-out-that-i-have-been-invincible-for-a-long-time#44` |  |  |  |
| details thumbnail URL | PASS | `https://storage.kencomics.com/.../cover_1744394904211.webp` |  |  |  |
| details author | PASS | 奇想漫画 |  |  |  |
| details artist | PASS | 奇想漫画 |  |  |  |
| details genres | PASS | Manhua, Drama , Fantasy, Action, Shounen, Adventure, Martial Arts |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Over a five-year journey around the world, Ye Changqing first believed he could be like other cool novel protagonist systems with a plug-in, but even the most common immortal cultivator cannot be. Living close to a sect in a small town was his only option, so he started a business. His small store eventually turned into the holy land of all the righteous individuals, and the dog he raised up turned out to be the feared demon king. From that moment on, everyone acknowledged Ye Changqing as a Supreme Master. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 224 chapters |  |  |  |
| chapter dates | PASS | 224 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://storage.kencomics.com/.../image_5980_35da72be.webp` (image/webp (encoding: lossy), 1348524 bytes, 800x5980) |  |  |  |
