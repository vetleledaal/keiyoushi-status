# Extension Validation Report

- Extension: tachiyomi-all.webcomics-v1.6.11
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5830834696627804450
- Source name: Webcomics
- Source language: en
- Selected manga input: popular offset 0: Goblin's Ascent: From Loser to Winner (`.../67e20b7662661d12a148fa62`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Goblin's Ascent: From Loser to Winner (`.../67e20b7662661d12a148fa62`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Leveling Up into the Future (`.../66de9def8c252b242f5cbba6`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | My Passive Skills Hit Like a Truck (`.../6a57556d62661d5cba6bf1ee`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Roulette World (`.../6a2781ab62661d2f1a221342`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | Goblin's Ascent: From Loser to Winner (`.../67e20b7662661d12a148fa62`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Goblin's Ascent: From Loser to Winner (`.../67e20b7662661d12a148fa62`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 119 | Ch. 1 (`.../0966cf38949f8a83b87b0c1f`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 316 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Goblin's Ascent: From Loser to Winner, URL=`67e20b7662661d12a148fa62` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 92/92 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 92/92 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imgg-h.mangaina.com/.../h <redacted query values: ht and tw>` (image/webp (encoding: lossy), 38122 bytes, 400x533; server Content-Type: image/webp,image/gif,image/png,image/jpeg,image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `67e20b7662661d12a148fa62` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://imgg.mangaina.com/.../8ea1fe064d6ae3cbae7e6bbe4bd25892.webp` (image/webp (encoding: lossy), 43476 bytes, 540x720; server Content-Type: image/png) |  |  |  |
| details author | PASS | Huainanweiju/Fanqienovel+Origin Chequer Comic |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | After waking up in a goblin's body and getting brutally killed by humans, Jace Hurley triggers a life simulation game system. By continuously evolving, the blessed goblin crawls all the way up to become the world's strongest fighter. The Saint of Swords, the dragon mother Fryrmiel, angels, and goddesses have all succumbed to his charms. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 119 chapters |  |  |  |
| chapter dates | PASS | 119 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 316 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imgg.mangaina.com/.../RnM4bFJYaEFTVUFRUlE3Vko2UmdwQT09_103307b33d294e09451f4dfa2da4f517_cpImg.webp` (image/webp (encoding: lossy), 14624 bytes, 1080x900; server Content-Type: image/png) |  |  |  |
