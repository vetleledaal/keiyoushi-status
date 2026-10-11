# Extension Validation Report

- Extension: tachiyomi-all.mangadex-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: eu.kanade.tachiyomi.extension.all.mangadex.MangaDex
- Source ID: 2499283573021220255
- Source name: MangaDex
- Source language: en
- Selected manga input: popular offset 0: The Heroines of a Gal Game Who Avoided the End of Death Read My [Diary] And Found Out My Secret (`.../e8c316a1-fc1a-4870-b418-29d5013db516`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Heroines of a Gal Game Who Avoided the End of Death Read My [Diary] And Found Out My Secret (`.../e8c316a1-fc1a-4870-b418-29d5013db516`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Sumisaka-san's Wild Delusions! (`.../f29fa79d-f596-4ae5-a1d7-42de941690f3`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Wu Liu Qi: Heibai Shuanglong 2 (`.../73703e17-79cb-4557-a33b-ec688d47d86d`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 56 | Trouble Is My Business (`.../888d07fa-3ada-43cb-9607-a789c1a7f239`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Heroines of a Gal Game Who Avoided the End of Death Read My [Diary] And Found Out My Secret (`.../e8c316a1-fc1a-4870-b418-29d5013db516`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Heroines of a Gal Game Who Avoided the End of Death Read My [Diary] And Found Out My Secret (`.../e8c316a1-fc1a-4870-b418-29d5013db516`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Ch.1 (`.../6faa30e4-60a6-4dae-bb65-251797864663`) |  | <1s |
| pages | `getPageList(chapter)` | success | 58 |  |  | <1s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Heroines of a Gal Game Who Avoided the End of Death Read My \[Diary\] And Found Out My Secret, URL=`.../e8c316a1-fc1a-4870-b418-29d5013db516` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=I Thought I'd Be Popular in a World Where Chastity is Reversed., URL=`.../8556c131-23ed-42d6-98ba-5f2aa5037843` at page 1 offset 4 and page 2 offset 17, title=Trouble Is My Business, URL=`.../888d07fa-3ada-43cb-9607-a789c1a7f239` at page 1 offset 23 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://uploads.mangadex.org/.../22571b51-18cc-427b-ad05-ea298fa73fb4.jpg` (image/jpeg, 149012 bytes, 960x540) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../e8c316a1-fc1a-4870-b418-29d5013db516` |  |  |  |
| details thumbnail URL | PASS | `https://uploads.mangadex.org/.../22571b51-18cc-427b-ad05-ea298fa73fb4.jpg` |  |  |  |
| details author | PASS | addict |  |  |  |
| details artist | PASS | HEIROU, Tonari Keru |  |  |  |
| details genres | PASS | Adaptation, Comedy, Drama, Mystery, Psychological, Romance, Tragedy, Harem, School Life, Shounen, Content rating: Suggestive, Japanese |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | I reincarnated as Iriya Satoshi, a mob character in a gal game world. But for some reason, the heroines are worshipping me?!<br>And to make matter worse, every single one of them is a complete yandere...<br><br>"I'm sorry. Please don't throw me away. Don't hate me."<br>"...I only have eyes for you. We'll be together forever, right?"<br><br>The actual protagonist is right there, so why are they all coming after me?!<br><br>By the way... where did my \[Diary\] go? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 58 of 58 pages have invalid URLs: page 1: imageUrl=`.../1-7ab6be15a98d99859b88e3d37b29c3c1f858a251911b1a37446155a264ed50a8.png` (relative URL), page 2: imageUrl=`.../2-dbc1bdeff6266b43d75aef5b315273e543858a13a1cc0df09d072319bd6b117d.png` (relative URL), page 3: imageUrl=`.../3-aa4a45564c23878a46dc29087d6398eba1767290d79cafd20f1dd601d8269d45.png` (relative URL), page 4: imageUrl=`.../4-257672ac0d713cac476979991473c0051ff1eb1829e0bd9283a085318cdf3273.png` (relative URL), page 5: imageUrl=`.../5-e124712aedc6ed86b03d1a5a5365bb70ad4784b648ba0a926720c0eed5e524dc.png` (relative URL), and 53 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `.../1-7ab6be15a98d99859b88e3d37b29c3c1f858a251911b1a37446155a264ed50a8.png` (image/png, 3197299 bytes, 1439x2046) |  |  |  |
