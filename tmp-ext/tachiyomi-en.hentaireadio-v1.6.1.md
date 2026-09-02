# Extension Validation Report

- Extension: tachiyomi-en.hentaireadio-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1055804712296309124
- Source name: HentaiRead.io
- Source language: en
- Selected manga input: popular offset 0: My Mother (`.../my-mother-16820`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 37 | My Mother (`.../my-mother-16820`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 37 | MY ISEKAI HAREM ～Sex Conquest in Another World～ (`.../my-isekai-harem-%EF%BD%9Esex-conquest-in-another-world%EF%BD%9E-3585`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 37 | My Lewd College Friends (`.../my-lewd-college-friends-51767`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 37 | Nee Nee Kei-chan Daisuki da yo!! dakara Motto Ichaicha Shimakurou ne | Hey hey Kei-chan, I love you!! So let's do lewd stuff together! (`.../nee-nee-keichan-daisuki-da-yo33;33;-dakara-motto-ichaicha-shimakurou-ne-hey-hey-keichan-i-love-you33;33;-so-let39;s-do-lewd-stuff-together33;-59012`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 37 | Haha ga Keiei Shiteiru no wa Isekai Yuri Sakaba nano ka!? | My Mother Runs An Isekai World Lezzy Tavern!? (`.../haha-ga-keiei-shiteiru-no-wa-isekai-yuri-sakaba-nano-ka33;-my-mother-runs-an-isekai-world-lezzy-tavern33;-58823`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Mother (`.../my-mother-16820`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Chapter 1 (`.../chapter-1-82423`) |  | <1s |
| pages | `getPageList(chapter)` | success | 65 |  |  | <1s |

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
| popular listing | PASS | 37 entries |  |  |  |
| latest listing | PASS | 37 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 37 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 1 manga entry: title=My Mother, URL=`.../my-mother-16820`; Popular page 2 repeats 1 manga entry: title=MY ISEKAI HAREM ～Sex Conquest in Another World～, URL=`.../my-isekai-harem-%EF%BD%9Esex-conquest-in-another-world%EF%BD%9E-3585`; Latest page 1 repeats 1 manga entry: title=My Lewd College Friends, URL=`.../my-lewd-college-friends-51767`; Latest page 2 repeats 1 manga entry: title=Nee Nee Kei-chan Daisuki da yo!! dakara Motto Ichaicha Shimakurou ne \| Hey hey Kei-chan, I love you!! So let's do lewd stuff together!, URL=`.../nee-nee-keichan-daisuki-da-yo33;33;-dakara-motto-ichaicha-shimakurou-ne-hey-hey-keichan-i-love-you33;33;-so-let39;s-do-lewd-stuff-together33;-59012` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 185/185 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 185/185 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentairead.io/.../1709118316-65df136cec489-thumb62651fe80530f.webp` (image/webp (encoding: lossy), 68532 bytes, 704x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-mother-16820` |  |  |  |
| details thumbnail URL | PASS | `https://hentairead.io/.../1709118316-65df136cec489-thumb62651fe80530f.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hentai |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 65 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ht.mgread.io/.../pic_001.jpg` (image/jpeg, 582823 bytes, 1007x1500) |  |  |  |
