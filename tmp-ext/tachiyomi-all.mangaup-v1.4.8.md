# Extension Validation Report

- Extension: tachiyomi-all.mangaup-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7689478295161479290
- Source name: Manga UP!
- Source language: en
- Selected manga input: popular offset 0: 404 Demons (`.../568`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 435 | 404 Demons (`.../568`) |  | 10s+ |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Wildcard Alchemist: Building the Ultimate Guild With a Divine Fluffy Beast and Random Alchemy Skill (`.../978`) |  | 10s+ |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | 404 Demons (`.../568`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 167 | Chapter 1.1 (`.../66298`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 435 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | SKIP | Timed out waiting for 30000 ms |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 445/445 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 445/445 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://global-img.manga-up.com/.../568.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 13370 bytes, 480x270) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../568` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://global-img.manga-up.com/.../568.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 40326 bytes, 960x540) |  |  |  |
| details author | PASS | Mochi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, GFantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | During the Edo period, the gods tasked Momotaro with exterminating demons that possessed and drained human life force with parasitic "bugs." Alongside his loyal vassals—Kensuke, Saruhiko, and Yukijiro—Momotaro fought valiantly until one day, a powerful demon nearly annihilated them all. On the verge of death, a god spoke out: "Momotaro, you must strike that demon down. Power will accumulate in a peach from which you shall be reborn. Choose a vassal whom I’ll make immortal to protect you during your slumber."<br><br>Centuries later, in the modern Reiwa era, the newly reincarnated Momotaro awakens… in the body of a chicken?! From Mochi, the creator of "Cuticle Detective Inaba" and "The Witch's Servant and the Demon Lord's Horn", comes a thrilling Japanese-style reincarnation fantasy!<br><br>(C)Mochi/SQUARE ENIX<br><br>Check on Saturdays for updates |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 167 chapters |  |  |  |
| chapter dates | LINT | 3 of 167 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://global-img.manga-up.com/.../1.webp.enc <redacted query values: h and e>` (image/webp (encoding: lossy), 70510 bytes, 1080x1536; server Content-Type: application/octet-stream) |  |  |  |
