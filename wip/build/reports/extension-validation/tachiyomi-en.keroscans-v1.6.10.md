# Extension Validation Report

- Extension: tachiyomi-en.keroscans-v1.6.10
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7842256049285233541
- Source name: KeroScans
- Source language: en
- Selected manga input: popular offset 0: Since My Previous Life was a Wise Man, I can Afford to Live. (`.../since-my-previous-life-was-a-wise-man-i-can-afford-to-live`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Since My Previous Life was a Wise Man, I can Afford to Live. (`.../since-my-previous-life-was-a-wise-man-i-can-afford-to-live`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | I Reincarnated as a Villainous Noble Who Dies in the Mid-Game, so I Used the Useless "Tame" Skill to Become the Strongest (`.../i-reincarnated-as-a-villainous-noble-who-dies-in-the-mid-game-so-i-used-the-useless-tame-skill-to-become-the-strongest`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Kuni wo Owareta Ryuushi-san, Hirowareta Ringoku de Ukkari Musou shite Shimau. (`.../kuni-wo-owareta-ryuushi-san-hirowareta-ringoku-de-ukkari-musou-shite-shimau`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | I Reincarnated as a Mob Villain Prince Who Dies Before the Game Even Starts ~In order to be happy with my favorite heroine's sister, I excessively mastered the weakest magic, [Dark Blade], and it ended up becoming the strongest, most broken magic~ (`.../i-reincarnated-as-a-mob-villain-prince-who-dies-before-the-game-even-starts-in-order-to-be-happy`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Since My Previous Life was a Wise Man, I can Afford to Live. (`.../since-my-previous-life-was-a-wise-man-i-can-afford-to-live`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Since My Previous Life was a Wise Man, I can Afford to Live. (`.../since-my-previous-life-was-a-wise-man-i-can-afford-to-live`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 85 | Chapter 1 (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 73 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Since My Previous Life was a Wise Man, I can Afford to Live., URL=`.../since-my-previous-life-was-a-wise-man-i-can-afford-to-live` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://keroscans.net/.../cover-3356dd1be6e47f92.webp` (image/webp (encoding: lossy), 223684 bytes, 1000x1422) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../since-my-previous-life-was-a-wise-man-i-can-afford-to-live` |  |  |  |
| details thumbnail URL | PASS | `https://keroscans.net/.../cover-3356dd1be6e47f92.webp` |  |  |  |
| details author | PASS | KUZU Shichio |  |  |  |
| details artist | PASS | ENDA Marimo |  |  |  |
| details genres | PASS | Manga, Japanese, Seinen, Action, Adventure, Comedy, Drama, Ecchi, Magic, Male Protagonist, Shameless Protagonist |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Manga · Serialized · Japanese<br><br>Born to excellent parents, Reus is abandoned shortly after being born due to a mismeasurement of magical aptitude. However, he was a super baby who had the memory and ability of his previous life where he was touted as a Great Sage, and was able to fly, not to mention handle conversation and walking! As he adventures with the sacred dragon familiar, Lindworm, enjoy the life of a baby Sage who becomes a person and enjoys freedom! Official JP: (https://comic-earthstar.com/.../e<br><br>**Alternative Names:**<br>- He Was Abandoned Right After He Was Born, but He Was a Great Sage in His Previous Life, so He Is Able to Live With Ease ~The Strongest Baby Is Out of Control~<br>- Since My Previous Life Was A Sage, I Can Afford To Live<br>- Since My Previous Life Was a Wise Man, I Can Afford to Live<br>- The Strongest Baby Goes Wild!: Abandoned at Birth, but Living Easy Thanks to My Previous Life as a Great Sage<br>- 雖然剛出生就被拋棄了，可畢竟前世是大賢者，就淡定地活下去吧<br>- 태어나자마자 버려졌지만 전생 대현자라서 여유롭게 살아갑니다<br>- Umareta Chokugo ni Suterareta kedo, Zensei ga Taikensha datta node Yoyuu de Ikitemasu ~Saikyou Akachan Daibousou~<br><br>**Chapters:** 113 · **Views:** 898 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 85 chapters |  |  |  |
| chapter dates | PASS | 85 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 73 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://keroscans.net/.../68f81a0aac110b11.webp` (image/webp (encoding: lossy), 92058 bytes, 1000x1400) |  |  |  |
