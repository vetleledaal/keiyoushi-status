# Extension Validation Report

- Extension: tachiyomi-en.hijalascans-v1.6.27
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
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
- Source ID: 454381816904772144
- Source name: Hijala Scans
- Source language: en
- Selected manga input: latest offset 0:  Monster Genius Players Like Me Too Much (`.../monster-genius-players-like-me-too-much`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Fog Land (`.../fog-land`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | Mimosa (`.../mimosa`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 117 |  Monster Genius Players Like Me Too Much (`.../monster-genius-players-like-me-too-much`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Garbage Time (`.../garbage-time`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 |  Monster Genius Players Like Me Too Much (`.../monster-genius-players-like-me-too-much`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 |  Monster Genius Players Like Me Too Much (`.../monster-genius-players-like-me-too-much`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 42 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | <1s |

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
| latest listing | PASS | 117 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title= Monster Genius Players Like Me Too Much, URL=`monster-genius-players-like-me-too-much#103` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Garbage Time, URL=`garbage-time#90` at page 1 offset 18 and page 2 offset 0, title=Hundred Years Game, URL=`hundred-years-game#28` at page 1 offset 19 and page 2 offset 1, title=Crimson Heart Wanderer, URL=`crimson-heart-wanderer#43` at page 1 offset 20 and page 2 offset 2, title=Ahiru no Sora, URL=`ahiru-no-sora#117` at page 1 offset 21 and page 2 offset 3, title=Guard Pass, URL=`guard-pass#89` at page 1 offset 22 and page 2 offset 4, title=Primitive Man Kim Dong-Woo, URL=`primitive-man-kim-dong-woo#46` at page 1 offset 23 and page 2 offset 5, title=In the Fridge , URL=`in-the-fridge#116` at page 1 offset 24 and page 2 offset 6, title=I'm Transforming, URL=`i'm-transforming#115` at page 1 offset 25 and page 2 offset 7, title=Voodoo Slam, URL=`vslam#55` at page 1 offset 26 and page 2 offset 8, title=Hero Killer, URL=`hero-killer#111` at page 1 offset 27 and page 2 offset 9, title=Korean Mercenary’s Wild West, URL=`korean-mercenary's-wild-west#110` at page 1 offset 28 and page 2 offset 10, title=Clevatess: The Devil Beast King, The Baby, & The Corpse Hero, URL=`clevatess:-the-devil-beast-king-the-baby-and-the-corpse-hero#34` at page 1 offset 29 and page 2 offset 11, title=Reincarnation of the Veteran Soldier, URL=`reincarnation-of-the-veteran-soldier#107` at page 1 offset 30 and page 2 offset 12, title=Gu Sera, URL=`gu-sera#33` at page 1 offset 31 and page 2 offset 13, title=Rust, URL=`rust#72` at page 1 offset 32 and page 2 offset 14, title=Money Hole, URL=`money-hole#63` at page 1 offset 33 and page 2 offset 15, title=To Not Die, URL=`to-not-die#98` at page 1 offset 34 and page 2 offset 16, title=Underboxer , URL=`underboxer#53` at page 1 offset 35 and page 2 offset 17 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 172/172 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 172/172 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.en-hijala.com/.../1563a890-d508-45e2-b136-2bf1a3ff490e.png` (image/png, 1029046 bytes, 690x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `monster-genius-players-like-me-too-much#103` |  |  |  |
| details thumbnail URL | PASS | `https://storage.en-hijala.com/.../1563a890-d508-45e2-b136-2bf1a3ff490e.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Drama, Comedy, sports |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A utility genius baseball player monopolizes the love of aces.<br><br>Alternative Names: Monster Genius Players Really Like Me • 괴물 천재선수들이 날 너무 좋아함 • All the Aces Are Obsessed With Me |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title |  |  |  |
| chapters | PASS | 42 chapters |  |  |  |
| chapter dates | PASS | 42 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://storage.en-hijala.com/.../page-0001_001_1783599128074-586800.webp` (image/webp (encoding: lossy), 98000 bytes, 800x4320) |  |  |  |
