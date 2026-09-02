# Extension Validation Report

- Extension: tachiyomi-en.mangademon-v1.4.20
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2900023289777642714
- Source name: Manga Demon
- Source language: en
- Selected manga input: latest offset 0: I Quit the Hero's Party (`.../I-Quit-the-Hero%2527s-Party`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 56 | Martial Peak (`.../Martial-Peak`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 56 | Regressing with t... (`.../Regressing-with-the-Kings-Power`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 40 | I Quit the Hero's Party (`.../I-Quit-the-Hero%2527s-Party`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | Clever Cleaning Life Of The Returned ... (`.../Clever-Cleaning-Life-Of-The-Returned-Genius-Hunter`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | I Quit the Hero's Party (`.../I-Quit-the-Hero%2527s-Party`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | I Quit the Hero's Party (`.../I-Quit-the-Hero%2527s-Party`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 172 | Chapter 1 (`.../chaptered.php <redacted query values: manga and chapter>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 56 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Quit the Hero's Party, URL=`.../I-Quit-the-Hero%2527s-Party` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 193/193 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 193/193 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://readermc.org/.../I Quit the Hero’s Party.webp` (image/webp (encoding: lossy), 137914 bytes, 720x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../I-Quit-the-Hero%2527s-Party` |  |  |  |
| details thumbnail URL | PASS | `https://readermc.org/.../I Quit the Hero’s Party.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Coming Soon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | I Quit the Hero's Party is a Manga/Manhwa/Manhua in (English/Raw) language, Action series, english chapters have been translated and you can read them here. You are reading chapters on the fastest updating comic site. The Summary is There was once a party who sought to defeat the Demon Lord and save the world, the Hero's Party. However, tired of the Hero's Party unwillingness to go directly after the Demon Lord, the Ashen Wizard Raniel quit the Hero's Party and returned to his hometown to meet with his master. There, he was recommended a position as an assistant professor at a prestigious academy. "Why are you so bad at this? Just make circuits, cover yourself in mana, and use it." However, a genius like him didn't seem to have any aptitude for teaching others... The strongest of mankind begins his hectic new job at the academy! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 172 chapters |  |  |  |
| chapter dates | PASS | 172 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://demoniclibs.com/.../1.jpg` (image/jpeg, 78437 bytes, 1000x667) |  |  |  |
