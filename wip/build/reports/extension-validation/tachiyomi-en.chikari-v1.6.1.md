# Extension Validation Report

- Extension: tachiyomi-en.chikari-v1.6.1
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
- Source ID: 8528134465693373218
- Source name: Chikari
- Source language: en
- Selected manga input: popular offset 0: The Bastard of Swordborne (`.../the-bastard-of-swordborne`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | The Bastard of Swordborne (`.../the-bastard-of-swordborne`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | The God of High School (`.../the-god-of-high-school`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 36 | Sunggi's Study Group (`.../sunggis-study-group`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Ayeokbuteo World Star! (`.../ayeokbuteo-world-star`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Bastard of Swordborne (`.../the-bastard-of-swordborne`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Bastard of Swordborne (`.../the-bastard-of-swordborne`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 243 | Chapter 1 (`.../1 <redacted query values: scan>`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 50 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Bastard of Swordborne, URL=`.../the-bastard-of-swordborne` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.irakich.st/.../cover.webp` (image/webp (encoding: lossy), 114964 bytes, 719x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-bastard-of-swordborne` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.irakich.st/.../cover.webp` |  |  |  |
| details author | PASS | Next Level Studio, Ppangmeongneundaramjwi |  |  |  |
| details artist | PASS | Next Level Studio |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Drama, Fantasy, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★✬☆ 7.2 (44)<br>2024<br><br>Theo Ragnar, the 31st son of the mighty Grand Duke of Ragnar, was born without the legendary Ragnar Gift—a fatal flaw in a family where might is right. Labeled the “Ragnar Defect,” he and his mother were betrayed, meeting a brutal end at the hands of those they trusted. But death was only the beginning. Reborn at 17, Theo awakens not only with the Ragnar Gift, but with powers far beyond imagination. Fueled by vengeance and a second chance, he sets out to claim the glory he was once denied.<br><br>(Source: Tapas)<br><br>**Alternative Names:**<br>- El bastardo regresado del Clan de la Espada<br>- Hoegwi Geomga-ui Seoja-ga Saneun Beop<br>- Hoegwigeomgaui Seojaga Saneun Beop<br>- How to Survive as the Bastard of the Regression Sword Clan<br>- La regresión del bastardo reencarnado del clan de la espada<br>- Regresando como el bastardo reencarnado del clan de la espada<br>- Regressed Life of the Sword Clan’s Ignoble Reincarnator<br>- Regressing As The Bastard Of The Sword Clan<br>- Regressing as the Bastard of the Sword Clan<br>- Regressing as the Reincarnated Bastard of the Sword Clan<br>- The Bastar of the Sword Clan Lives Again<br>- The Life of a Regressed Sword Master's Illegitimate Son<br>- 회귀검가의 서자가 사는 법<br><br>**Links:**<br>- \[AniList\](https://anilist.co/.../183855)<br>- \[MyAnimeList\](https://myanimelist.net/.../175209)<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../f40yr56) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 243 chapters |  |  |  |
| chapter dates | PASS | 243 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.irakich.st/.../000.webp` (image/webp (encoding: lossy), 592290 bytes, 800x4255) |  |  |  |
