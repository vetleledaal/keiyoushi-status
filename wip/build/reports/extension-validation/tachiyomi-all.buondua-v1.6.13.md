# Extension Validation Report

- Extension: tachiyomi-all.buondua-v1.6.13
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1435103006121310663
- Source name: Buon Dua
- Source language: all
- Selected manga input: latest offset 0: Pure Media Vol.329: Yeha (예하) – Watch Football Eats Me (106 photos) (`.../pure-media-vol-329-yeha-yeha---watch-football-eats-me-106-photos-68cb0fd246137def7b82228fbce9df30-57675`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Haivia Zia (지아): Izakaya Boss and Me (155 photos) (`.../haivia-zia-jia-izakaya-boss-and-me-155-photos-6c7dbdd98cd70f67f102524761f3b4d2-57631`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | [AI Enhanced] X-Level Zirin (지린): Vol.97 Naked in Bathtub (131 photos) (`.../ai-enhanced-x-level-zirin-jilin-vol-97-naked-in-bathtub-131-photos-8e7b7b0a23152d1de94f5cb6b3f3cb8a-57591`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Pure Media Vol.329: Yeha (예하) – Watch Football Eats Me (106 photos) (`.../pure-media-vol-329-yeha-yeha---watch-football-eats-me-106-photos-68cb0fd246137def7b82228fbce9df30-57675`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Coser@铁手叫兽: 小猫小吊带 (26 photos + 1 video) (`.../coser-tie-shou-jiao-shou-xiao-mao-xiao-diao-dai-26-photos-1-video-6117e52d027c82ea3813b123ab336f86-57660`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Pure Media Vol.329: Yeha (예하) – Watch Football Eats Me (106 photos) (`.../pure-media-vol-329-yeha-yeha---watch-football-eats-me-106-photos-68cb0fd246137def7b82228fbce9df30-57675`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Pure Media Vol.329: Yeha (예하) – Watch Football Eats Me (106 photos) (`.../pure-media-vol-329-yeha-yeha---watch-football-eats-me-106-photos-68cb0fd246137def7b82228fbce9df30-57675`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Page 1 (`.../pure-media-vol-329-yeha-yeha---watch-football-eats-me-106-photos-68cb0fd246137def7b82228fbce9df30-57675 <redacted query values: page>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

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
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pure Media Vol.329: Yeha (예하) – Watch Football Eats Me (106 photos), URL=`.../pure-media-vol-329-yeha-yeha---watch-football-eats-me-106-photos-68cb0fd246137def7b82228fbce9df30-57675` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.buondua.com/.../Pure-Media-Vol.329-Yeha-Your-Majesty-Watch-Football-Eats-Me-MissKON.com-105.jpeg <redacted query values: 649cbee944f77e07c1fe9caa79090853>` (image/jpeg, 76709 bytes, 1024x1536) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../pure-media-vol-329-yeha-yeha---watch-football-eats-me-106-photos-68cb0fd246137def7b82228fbce9df30-57675` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Pure Media, Yeha |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | \[👉 Download link: MediaFire\](https://ouo.io/.../LZeTYjQ)<br>\[👉 Download link: Terabox\](https://ouo.io/.../SmfmMPF)<br><br><redacted credential header: password> |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i2.buondua.com/.../Pure-Media-Vol.329-Yeha-Your-Majesty-Watch-Football-Eats-Me-MissKON.com-001.jpeg <redacted query values: 649cbee944f77e07c1fe9caa79090853>` (image/jpeg, 180919 bytes, 2304x1536) |  |  |  |
