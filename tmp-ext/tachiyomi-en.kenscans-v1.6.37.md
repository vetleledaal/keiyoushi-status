# Extension Validation Report

- Extension: tachiyomi-en.kenscans-v1.6.37
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
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
- Selected manga input: latest offset 0: I became the stepmother who caused my favorite character to fall into darkness (`.../i-became-the-stepmother-who-caused-my-favorite-character-to-fall-into-darkness`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | I've Been Invincible for a Long Time (`.../it-turns-out-that-i-have-been-invincible-for-a-long-time`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | Jiyujiyo (`.../jiyujiyo`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | I became the stepmother who caused my favorite character to fall into darkness (`.../i-became-the-stepmother-who-caused-my-favorite-character-to-fall-into-darkness`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Men City (`.../men-city`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I became the stepmother who caused my favorite character to fall into darkness (`.../i-became-the-stepmother-who-caused-my-favorite-character-to-fall-into-darkness`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I became the stepmother who caused my favorite character to fall into darkness (`.../i-became-the-stepmother-who-caused-my-favorite-character-to-fall-into-darkness`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 31 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 27 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I became the stepmother who caused my favorite character to fall into darkness, URL=`i-became-the-stepmother-who-caused-my-favorite-character-to-fall-into-darkness#67` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.kencomics.com/.../cover_1744395592349.webp` (image/webp (encoding: lossy), 177632 bytes, 500x707) |  |  |  |
| details identity | PASS | Details preserved selected URL `i-became-the-stepmother-who-caused-my-favorite-character-to-fall-into-darkness#67` |  |  |  |
| details thumbnail URL | PASS | `https://storage.kencomics.com/.../cover_1744395592349.webp` |  |  |  |
| details author | PASS | NISHIZEN Mio |  |  |  |
| details artist | PASS | C&R Creative Studios |  |  |  |
| details genres | PASS | Manhwa, Josei, Romance, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Akari, who possessed the body of her favorite character's stepmother. While she was delighted to see her beloved character in their adorable childhood up close, she realized that she herself is the stepmother 'Elena,' the person responsible for causing the character to fall into darkness. Determined to avoid the character's descent into darkness and make them happy, Akari faces numerous challenges as the misdeeds of Elena before the possession come back to haunt her. Will she be able to make her favorite character happy?<br><br>Alternative Names: 日本語 (にほんご／にっぽんご) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 31 chapters |  |  |  |
| chapter dates | PASS | 31 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://storage.kencomics.com/.../image_4180_9a640f6c.webp` (image/webp (encoding: lossy), 759414 bytes, 800x4180) |  |  |  |
