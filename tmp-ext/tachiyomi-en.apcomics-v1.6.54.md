# Extension Validation Report

- Extension: tachiyomi-en.apcomics-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7848750588298461115
- Source name: AP Comics
- Source language: en
- Selected manga input: popular offset 0: Sinful Lust (`.../4206`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Sinful Lust (`.../4206`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | A Couple who moved to a Village with a tradition of Sneaking into a Woman’s Bed [almondman] [TOMISCANS] (`.../5827`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | [Jopuari] FUCK THAT MILF #1 – Kathryn 💕[complete] (`.../8839`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | [Cathriell Rue] Healthy mother and son relationship (My Hero Academia) (`.../8761`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Sinful Lust (`.../7533`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sinful Lust (`.../4206`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 14 | 1. CHAPTER - 1 (`.../1-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 180 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 3: title=Sinful Lust, URL=`4206` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 104/104 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 104/104 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://apcomics.org/.../51c0bb03a0033cc13db51c8221d250a02c2f4deb91d220caf35963bcd0f50af5-350x476.avif` (image/avif (format: avif), 10810 bytes, 350x476; server Content-Type: text/plain) |  |  |  |
| details identity | PASS | Details preserved selected URL `4206` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://apcomics.org/.../51c0bb03a0033cc13db51c8221d250a02c2f4deb91d220caf35963bcd0f50af5-scaled.avif` (image/avif (format: avif), 66289 bytes, 1779x2560; server Content-Type: text/plain) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | doujinshi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | read at apcomics.org decade for mom son porn comics<br><br>Read the latest Manga, all chapters in English, at APComics. Manga is always updated at APComics. Don’t forget to read other Manga updates as well. A list of Manga collections on APComics can be found in the All Mangas List menu.<br><br>Browse over 1000 Webtoons online for free! Read popular Manhwa and full-color Korean comics for free on APComics. Discover your favorite free premium Manhwa and English Webtoon chapters at no cost. New Manhwa updates are available hourly on APComics. Follow APComics to get the fastest notifications about the latest Manhwa releases.<br><br><br><br>Read more like:<br><br>porn comics, comic book porn, erotic comics, interracial comics, anime porn comics, milftoon, free adult comics, jab comics, xlecx, cartoon sex stories, futa comics, femboy comics, nude comics, webtoon porn, porn webtoons, toomics sex, toomics porn, henti comics<br><br>sex comic, porn comics, porn manga, best porn comics, erotic comics<br><br><br><br><br><br>SINFUL LUST porn comics download ,<br><br>SINFUL LUST anime porn comics,<br><br>SINFUL LUST free adult comics,<br><br>SINFUL LUST cartoon sex stories,<br><br>SINFUL LUST sex comic,<br><br>SINFUL LUST porn comics,<br><br>porn manga,<br><br>SINFUL LUST best porn comics,<br><br>SINFUL LUST erotic comics |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | LINT | 6 of 14 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 180 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://apcomics.org/.../1.jpg` (image/jpeg, 195584 bytes, 1280x1687) |  |  |  |
