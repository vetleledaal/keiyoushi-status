# Extension Validation Report

- Extension: tachiyomi-en.manhuatop-v1.6.59
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
- Source ID: 1903782575226230108
- Source name: ManhuaTop
- Source language: en
- Selected manga input: popular offset 0: The Heavenly Demon Can't Live a Normal Life (`.../the-heavenly-demon-cant-live-a-normal-life-mh`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | The Heavenly Demon Can't Live a Normal Life (`.../the-heavenly-demon-cant-live-a-normal-life-mh`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | S-Class Hunter Heals with Monsters (`.../s-class-hunter-heals-with-monsters`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Corrupted Paladin Is Obsessed With Me (`.../the-corrupted-paladin-is-obsessed-with-me`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Heavenly Demon's Otherworld Livestream (`.../the-heavenly-demon-s-otherworld-livestream`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Heavenly Demon Can't Live a Normal Life (`.../the-heavenly-demon-cant-live-a-normal-life-mh`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Heavenly Demon Can't Live a Normal Life (`.../the-heavenly-demon-cant-live-a-normal-life-mh`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 221 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 7 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Heavenly Demon Can't Live a Normal Life, URL=`.../the-heavenly-demon-cant-live-a-normal-life-mh` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cache.manhuatop.org/.../post_76363_image.jpg` (image/png, 116406 bytes, 193x278; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-heavenly-demon-cant-live-a-normal-life-mh` |  |  |  |
| details thumbnail URL | PASS | `https://cache.manhuatop.org/.../post_76363_image.jpg` |  |  |  |
| details author | PASS | ZAINO, usa manhwa, San Cheon, THCLAPL, San Cheon (산천), 천마 백중혁 |  |  |  |
| details artist | PASS | usa manhwa, Altoran, Upudubu (우푸), Altoran (알토란) |  |  |  |
| details genres | PASS | Manhwa, Drama, Fantasy, Martial Arts, Shounen, Action, Adventure, Isekai, Webtoon, action manhwa, Fantasy Manhwa, Manhwa Fantasy, manhwa Action, Fantasy Webtoons |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★ 4.4 (543 votes) · 9.3M views · 2021<br><br>‘Heavenly Demon’ Baek Joong-Hyuk opens his eyes as the eldest son of the Dimitry family.<br><br>Known as the fool of the Dimitry family, pushed over by the second son. The world’s opinion is irrelevant.<br><br>‘Heavenly Demon’, no, Roman Dimitry, cannot live a normal life.<br><br>OP ‘Heavenly Demon’ fantasy!<br><br>**Alternative titles:**<br>- Descended from Divinity<br>- Cheonmaneun Pyeongbeomhage Sal Su Eopda<br>- El demonio celestial no puede llevar una vida normal<br>- O Demônio Celestial não pode viver uma Vida Normal<br>- The Reincarnation of the Dark Master<br>- Реинкарнация тёмного магистра<br>- Тэнгэрлэг Чөтгөр Энгийнээр Амьдарч Чадахгүй<br>- มารสวรรค์จะมีชีวิตธรรมดาไม่ได้หรอก!<br>- 天魔に平凡な人生はない<br>- 天魔的不凡重生<br>- 천마는 평범하게 살 수 없다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 221 chapters |  |  |  |
| chapter dates | PASS | 221 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s2.manhuatop.org/.../ch_0_1.jpg` (image/jpeg, 239696 bytes, 1000x1778) |  |  |  |
