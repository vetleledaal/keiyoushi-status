# Extension Validation Report

- Extension: tachiyomi-all.mangaball-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.P
- Source ID: 1448906013733277368
- Source name: Manga Ball
- Source language: en
- Selected manga input: latest offset 0: Shinryaku! Ika Musume (`.../shinryaku-ika-musume-68517cb3a8ac8339e73c5a55`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Tears on a Withered Flower (`.../tears-on-a-withered-flower-685155e6702284f834178607`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | The Fragrant Flower Blooms with Dignity (`.../the-fragrant-flower-blooms-with-dignity-6851599e702284f834178e65`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Shinryaku! Ika Musume (`.../shinryaku-ika-musume-68517cb3a8ac8339e73c5a55`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Gyaru Shinkan wa Rizare ga Darui (`.../gyaru-shinkan-wa-rizare-ga-darui-69d658f28d77da06ec287cb3`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Shinryaku! Ika Musume (Invasion! Squid Girl/ The Invader Comes from the Bottom of the Sea!/ 侵略!イカ娘/ Shinryaku! Ika Musume/ The Invader Comes From the Bottom of the Sea!) (`.../shinryaku-ika-musume-68517cb3a8ac8339e73c5a55`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Shinryaku! Ika Musume (`.../shinryaku-ika-musume-68517cb3a8ac8339e73c5a55`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1251 | Ch. 0 NO-GROUP (`.../6aa18287310772c03ea241be`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 4 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shinryaku! Ika Musume (Invasion! Squid Girl/ The Invader Comes from the Bottom of the Sea!/ 侵略!イカ娘/ Shinryaku! Ika Musume/ The Invader Comes From the Bottom of the Sea!), URL=`shinryaku-ika-musume-68517cb3a8ac8339e73c5a55` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bulbasaur.poke-black-and-white.net/.../cover_1754827389357.jpg` (image/jpeg, 290144 bytes, 776x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `shinryaku-ika-musume-68517cb3a8ac8339e73c5a55` |  |  |  |
| details thumbnail URL | PASS | `https://bulbasaur.poke-black-and-white.net/.../cover_1754827389357.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Comedy, Fantasy, Slice of Life, Supernatural |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | The sea in our world has been polluted. All sort of trash have been thrown into the sea, making it unpleasant to live underwater. One of the inhabitants of the sea, Ika Musume (Squid Girl) seeks to exact revenge on humanity for throwing trash into the sea. Clueless about the surface, she tries to invade humanity alone and rule over the world, only to find herself slaving away at one of the nearest beach houses for breaking a side of its wall.<br><br>Published: 2007<br><br>Alternative Names: <br>- Invasion! Squid Girl<br>- The Invader Comes from the Bottom of the Sea!<br>- 侵略!イカ娘<br>- Shinryaku! Ika Musume<br>- The Invader Comes From the Bottom of the Sea! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1251 chapters |  |  |  |
| chapter dates | PASS | 1251 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://chikorita.red-and-blue.net/.../6aa18287310772c03ea241be-001.webp` (image/webp (encoding: lossy), 493490 bytes, 1107x1600) |  |  |  |
