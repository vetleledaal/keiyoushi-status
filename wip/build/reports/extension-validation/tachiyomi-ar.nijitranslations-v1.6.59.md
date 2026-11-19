# Extension Validation Report

- Extension: tachiyomi-ar.nijitranslations-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 2102294221965772686
- Source name: Niji Translations
- Source language: ar
- Selected manga input: popular offset 0: Mage & Demon Queen (`.../4863`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Mage & Demon Queen (`.../4863`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Unnie’s taste (`.../5297`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Daily Dose Of Yuri (`.../4940`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Touko-san wa Kaji ga Dekinai (Pre-serialization) (`.../8580`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mage & Demon Queen (`.../4863`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mage & Demon Queen (`.../4863`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 197 | 00 (`.../00`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mage & Demon Queen, URL=`4863` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://niji-translations.com/.../mage_e_demon-175x238.png` (image/png, 91622 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `4863` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://sp-ao.shortpixel.ai/.../mage_e_demon-193x278.png` (image/png, 114089 bytes, 193x278) |  |  |  |
| details author | PASS | Color·LES |  |  |  |
| details artist | PASS | Color·LES |  |  |  |
| details genres | PASS | خيال عليمي, رومانسي, كوميدي, كوميك, يوري, يوري خفيف, سحر - خيال - رومانسية - كوميدي - يوري |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | معظم المغامرين يسعون وراء رأس ملكة الشياطين.. ولكن، على خلافهم.. هناك فتاة شابة تسعى للحصول على يدها! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 197 chapters |  |  |  |
| chapter dates | PASS | 197 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `admin-ajax.php` at offsets 0, 1, 2, 3, 4, 5, 6, 71 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://sp-ao.shortpixel.ai/.../01.png` to `https://niji-translations.com/.../01.png` (1 redirects) |  |  |  |
| page load | PASS | `https://sp-ao.shortpixel.ai/.../01.png` (image/png, 1164957 bytes, 800x1170) |  |  |  |
