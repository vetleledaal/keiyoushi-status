# Extension Validation Report

- Extension: tachiyomi-all.yaoimangaonline-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 28
- Lint: 2
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7988826691692266469
- Source name: Yaoi Manga Online
- Source language: all
- Selected manga input: popular offset 0: The Curse of the Small Dick by S.ppuccino – Uncensored – Ch. 12-13 [Eng] (`.../the-curse-of-the-small-dick-by-s-ppuccino-uncensored-eng`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | The Curse of the Small Dick by S.ppuccino – Uncensored – Ch. 12-13 [Eng] (`.../the-curse-of-the-small-dick-by-s-ppuccino-uncensored-eng`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Love Shuttle by Aeju [Eng] (`.../love-shuttle-by-aeju-eng`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 22 | The Curse of the Small Dick by S.ppuccino – Uncensored – Ch. 12-13 [Eng] (`.../the-curse-of-the-small-dick-by-s-ppuccino-uncensored-eng`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Curse of the Small Dick (`.../the-curse-of-the-small-dick-by-s-ppuccino-uncensored-eng`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 13 | Chapter 1 (`.../2`) |  | <1s |
| pages | `getPageList(chapter)` | success | 52 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Curse of the Small Dick by S.ppuccino – Uncensored – Ch. 12-13 \[Eng\], URL=`.../the-curse-of-the-small-dick-by-s-ppuccino-uncensored-eng` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 70/70 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 70/70 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yaoimangaonline.com/.../Screenshot-2026-09-27-at-2.16.29-AM.png` (image/png, 116743 bytes, 204x300) |  |  |  |
| details identity | UNUSUAL | Details changed selected title The Curse of the Small Dick by S.ppuccino – Uncensored – Ch. 12-13 \[Eng\] to The Curse of the Small Dick |  |  |  |
| details thumbnail URL | PASS | `https://yaoimangaonline.com/.../Screenshot-2026-09-27-at-2.16.29-AM.png` |  |  |  |
| details author | PASS | S. ppuccino, Blue Jelly |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Anal Sex, BDSM Yaoi, Beautiful Art, Big Ass, Big Breasts, Big Muscles, Big Penis, Blowjob, Comedy, English, First Love, Fuck buddy, Full Color, Group Sex, Hardcore, Hot Boys, Hot Sex, Innocent Looking, Intense Sex, Older Uke Younger Seme, Pretty Seme, Sex toy, Slutty Uke, Smut, Twink Seme, Uncensored Yaoi, Yaoi Manhwa |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Manhwa: The Curse of the Small Dick<br><br>Mangaka: S. ppuccino, Blue Jelly<br><br>Language: English<br><br>The Curse of the Small Dick Manhwa Plot: Lee Changyeon is a trashy top whose favorite hobby is opening up virgins all the way to their colons. His golden rule in life? Never look back at a man he’s already slept with. However, a thunderbolt out of the blue shatters his arrogant lifestyle: he is struck by an absurd curse that shrinks his dick every time he ejaculates! To make matters worse, the only way to break this damned curse is to receive semen deep inside his own colon. Well, how hard could it be? Sex is sex, so what if he’s the one taking it for a change? Changyeon immediately goes hunting for a well-endowed guy. Enter Bu Silhan, a cute, petite man who looks anything but hung. Though Silhan confidently claims he can break Changyeon’s curse, Changyeon dismisses him, completely unaware that the fragile-looking guy is secretly hiding the massive monster cock he’s been desperately searching for. Driven by Silhan’s desire for Changyeon’s heart and Changyeon’s obsession with a massive dick, their hot, hilarious, and utterly wild romance begins! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 13 chapters |  |  |  |
| chapter dates | LINT | All 13 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=13 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://yaoimangaonline.com/.../1` to `https://yaoimangaonline.com` (1 redirects) |  |  |  |
| page load | PASS | `https://yaoimangaonline.com/.../01-180.webp` (image/webp (container: extended), 43014 bytes, 730x1956) |  |  |  |
