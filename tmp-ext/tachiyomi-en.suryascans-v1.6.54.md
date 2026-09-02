# Extension Validation Report

- Extension: tachiyomi-en.suryascans-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1061713767402958340
- Source name: Genz Toons
- Source language: en
- Selected manga input: popular offset 0: The Lord Who Levels Up by Devouring Abilities (`.../the-lord-who-levels-up-by-devouring-abilities`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 225 | The Lord Who Levels Up by Devouring Abilities (`.../the-lord-who-levels-up-by-devouring-abilities`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 192 | The Player of a Fallen Prestigious Family (`.../the-player-of-a-fallen-prestigious-family`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Lord Who Levels Up by Devouring Abilities (`.../the-lord-who-levels-up-by-devouring-abilities`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Lord Who Levels Up by Devouring Abilities (`.../the-lord-who-levels-up-by-devouring-abilities`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 20 | Chapter 1 (`.../65a579a1888-65a5c90eb53`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 225 entries |  |  |  |
| latest listing | PASS | 192 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Lord Who Levels Up by Devouring Abilities, URL=`.../the-lord-who-levels-up-by-devouring-abilities` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 418/418 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 418/418 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url and w>` (image/jpeg, 84471 bytes, 480x640) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-lord-who-levels-up-by-devouring-abilities` |  |  |  |
| details thumbnail URL | PASS | `https://wsrv.nl <redacted query values: url and w>` |  |  |  |
| details author | PASS | 우주낭인 |  |  |  |
| details artist | PASS | 더블디,평타쟁이 |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The continent has been destroyed by the Emperor, and even the Allied Forces—their last hope—have suffered a crushing defeat. In that moment of utter despair— “Ad, this is an order. Absorb my heart.” \[Devour\]—an ability that allows its user to completely consume the talents and powers of others. Adrian absorbs the heart of Ian, his dying friend and a hero, and regresses fifteen years into the past—to the days when he was nothing more than a reckless troublemaker. “Ian... You want me to save the world? Sorry, but I couldn’t care less about that.” With the brutal combat experience from his previous life, a Player System that seems to have been passed down to him by Ian, and the limitless growth potential of \[Devour\], Adrian begins growing stronger at an overwhelming pace... “But I’ll promise you one thing. I’ll hunt those bastards down to the very end—and chew their hearts to pieces!!” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | PASS | 20 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../65a5c90eb53.avif` (image/avif (format: avif), 95570 bytes, 900x1779) |  |  |  |
