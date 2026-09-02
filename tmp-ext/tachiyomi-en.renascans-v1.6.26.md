# Extension Validation Report

- Extension: tachiyomi-en.renascans-v1.6.26
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3447464472094373275
- Source name: Renascans
- Source language: en
- Selected manga input: popular offset 0: The Incognito Princess  (`.../the-incognito-princess-j3rbe8x7`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | The Incognito Princess  (`.../the-incognito-princess-j3rbe8x7`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | The Beast's Footprints (`.../the-beasts-footprints-4v75hssr`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Underworld Invasion (`.../underworld-invasion`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Shining Nananana (`.../shining-nananana-8609krnl`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Incognito Princess  (`.../the-incognito-princess-j3rbe8x7`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Incognito Princess  (`.../the-incognito-princess-j3rbe8x7`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 44 | Chapter 45 (`.../chapter-45`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Incognito Princess , URL=`the-incognito-princess-j3rbe8x7#57` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.renascans.net/.../a4648256-4d49-4158-abb3-e9a342e1ac61.webp` (image/webp (encoding: lossy), 376206 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-incognito-princess-j3rbe8x7#57` |  |  |  |
| details thumbnail URL | PASS | `https://storage.renascans.net/.../a4648256-4d49-4158-abb3-e9a342e1ac61.webp` |  |  |  |
| details author | PASS | Saeseng |  |  |  |
| details artist | PASS | Hanabi |  |  |  |
| details genres | PASS | Manhwa, Romance, Fantasy, Reincarnation, Supernatural, Isekai,  Villainess |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | I’ve been reincarnated into a novel with my living and breathing bias. Now I’m an Imperial Princess, who is known by all sorts of epithets, Agnes Saint! It’s great that she’s filthy rich and a royal and all, but there’s just one problem… the hateful trash who just insulted by bias’s very existence is none other than ‘me.’ Regardless, I’m here now and… I will do anything, and everything, within my power to prevent my bias’s death and ensure he experiences nothing but smooth sailing going forward! I would never wish for Kylo, my kitten, to suffer any sort of shock. That’s why I have to hide my fervent adoration. Besides, nothing good would come from revealing my stanning anyways. So, for the time being, I’ll be perfect at… ‘stanning in secret.’<br><br>Alternative Names: 일코하는 황녀님 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title, genre |  |  |  |
| chapters | PASS | 44 chapters |  |  |  |
| chapter dates | PASS | 44 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://storage.renascans.net/.../00.webp` (image/webp (encoding: lossy), 762628 bytes, 1798x1267) |  |  |  |
