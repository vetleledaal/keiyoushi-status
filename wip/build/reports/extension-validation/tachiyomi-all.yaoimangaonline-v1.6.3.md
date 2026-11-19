# Extension Validation Report

- Extension: tachiyomi-all.yaoimangaonline-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 9170758785588278310
- Source name: Yaoi Manga Online
- Source language: en
- Selected manga input: popular offset 0: Hetalia Dj – Meteor by ★ (Komugiko) [Eng] (`.../hetalia-dj-meteor-by-%E2%98%85-komugiko-eng`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Hetalia Dj – Meteor by ★ (Komugiko) [Eng] (`.../hetalia-dj-meteor-by-%E2%98%85-komugiko-eng`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Hunk of the Month – Brainwashing Superhero to a Slut by DDugyu – Uncensored [Eng] (`.../hunk-of-the-month-brainwashing-superhero-to-a-slut-by-ddugyu-uncensored-eng`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Hetalia Dj – Meteor by ★ (Komugiko) [Eng] (`.../hetalia-dj-meteor-by-%E2%98%85-komugiko-eng`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Hetalia Dj – Meteor (`.../hetalia-dj-meteor-by-%E2%98%85-komugiko-eng`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../hetalia-dj-meteor-by-%E2%98%85-komugiko-eng`) |  | <1s |
| pages | `getPageList(chapter)` | success | 173 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hetalia Dj – Meteor by ★ (Komugiko) \[Eng\], URL=`.../hetalia-dj-meteor-by-%E2%98%85-komugiko-eng` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yaoimangaonline.com/.../fimage_Meteor.jpg` (image/jpeg, 10800 bytes, 214x300) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Hetalia Dj – Meteor by ★ (Komugiko) \[Eng\] to Hetalia Dj – Meteor |  |  |  |
| details thumbnail URL | PASS | `https://yaoimangaonline.com/.../fimage_Meteor.jpg` |  |  |  |
| details author | PASS | ★ (Komugiko) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hetalia Dj, Yaoi DJ, France/ Francis Bonnefoy x England/ United Kingdom, English, Hard Yaoi, Hardcore, Hentai, Hentai Yaoi, Romance, Yaoi, Yaoi Hentai, Yaoi Sex |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | DJ: Hetalia Dj – Meteor<br>Mangaka: \[★ (Komugiko)\](https://yaoimangaonline.com/.../%e2%98%85-komugiko)<br>Language: English |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 173 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://yaoimangaonline.com/.../resized_Meteor_1.jpg` (image/jpeg, 88898 bytes, 720x1005) |  |  |  |
