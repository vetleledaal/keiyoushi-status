# Extension Validation Report

- Extension: tachiyomi-en.asurascans-v1.6.72
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6247824327199706550
- Source name: Asura Scans
- Source language: en
- Selected manga input: popular offset 0: Overgeared (`.../overgeared`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Overgeared (`.../overgeared`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The Extra’s Academy Survival Guide (`.../the-extras-academy-survival-guide`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | The Sword Emperor’s Rise of Namgung (`.../the-sword-emperor-s-rise-of-namgung`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Immortal’s Way of Life (`.../immortals-way-of-life`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Overgeared (`.../overgeared`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Overgeared (`.../overgeared`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 349 | Chapter 0 - Prologue (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Overgeared, URL=`.../overgeared` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.asurascans.com/.../overgeared.905990.webp` (image/webp (encoding: lossy), 136938 bytes, 948x1280) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../overgeared` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.asurascans.com/.../overgeared.905990.webp` |  |  |  |
| details author | PASS | LEE Dong Wook/ PARK Saenal |  |  |  |
| details artist | PASS | REDICE Studio |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Comedy, Fantasy, Game |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Rank: #1 • Rating: 9.04 • Bookmarks: 74.3K<br><br>Shin Youngwoo (a.k.a. Greed), an unlucky man in life and a low-level player in the popular VR game “Satisfy,” finds a powerful item that earns him a rare legendary class title: “Pagma’s Successor.” He’s now a skilled blacksmith who can forge unique weapons and equip the game’s most powerful gear. Grid resolves to use his new abilities to achieve fame and fortune, but as his very existence begins to stir up trouble in Satisfy, he realizes that life as a legend may be more than he bargained for….<br><br>Alternative Titles:<br>- 템빨<br>- Overgeared<br>- Grid's Item Peak<br>- Item Overgeared<br>- Over Geared<br>- Over Power<br>- Temppal<br>- テムパル<br>- 装备之神<br>- Во всеоружии<br>- مجهز بالكامل<br>- Trâm Anh Thế Phiệt<br>- Suréquipé<br>- Equipado Hasta Los Dientes<br>- O Super Equipado<br>- Terlalu Banyak Diperlengkapi |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 13 name, chapter 14 name, chapter 15 name |  |  |  |
| chapters | PASS | 349 chapters |  |  |  |
| chapter dates | PASS | 349 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.asurascans.com/.../001.webp <redacted query values: v>` (image/webp (encoding: lossy), 117314 bytes, 1238x800) |  |  |  |
