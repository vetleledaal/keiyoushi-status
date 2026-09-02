# Extension Validation Report

- Extension: tachiyomi-all.hentaicosplay-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3422463439145930309
- Source name: Hentai Cosplay
- Source language: all
- Selected manga input: popular offset 0: Aqua Birthday Bunny (AI Generated) (`.../aqua-birthday-bunny-ai-generated`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | Aqua Birthday Bunny (AI Generated) (`.../aqua-birthday-bunny-ai-generated`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 32 | [Online Collection] Welfare Girl Zuo Gongzi "Love in the Palm" VIP Exclusive [36P] (`.../online-collection-welfare-girl-zuo-gongzi-love-in-the-palm-vip-exclusive-36p`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 32 | Yoshinobi - Wednesday Addams (`.../yoshinobi-wednesday-addams`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 32 | Altius - Frieren (`.../altius-frieren`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 13 | Aqua Birthday Bunny (AI Generated) (`.../aqua-birthday-bunny-ai-generated`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Aqua Birthday Bunny (AI Generated) (`.../aqua-birthday-bunny-ai-generated`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../aqua-birthday-bunny-ai-generated`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 54 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 32 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Aqua Birthday Bunny (AI Generated), URL=`.../aqua-birthday-bunny-ai-generated` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=钛alloy TiTi - 黑绫波丽 4, URL=`.../alloy-titi-4` at page 1 offset 20 and page 2 offset 20, title=Cloud Creek Succubus Cosplay エロ image, URL=`.../cloud-creek-succubus-cosplay--image` at page 1 offset 21 and page 2 offset 21, title=Alin ma Xenon - Eliza 3, URL=`.../alin-ma-xenon-eliza-3` at page 1 offset 22 and page 2 offset 22, title=Xenon - Ahri, URL=`.../xenon-ahri` at page 1 offset 23 and page 2 offset 23, title=Mik Allen - Juri-han Mik Allen - Juri-han, URL=`.../mik-allen-juri-han-mik-allen-juri-han` at page 1 offset 24 and page 2 offset 24, title=\[Choi Ji Yun\] Frieren, URL=`.../choi-ji-yun-frieren` at page 1 offset 25 and page 2 offset 25, title=Coser@日奈娇: 小秘书 (107 photos + 4 videos), URL=`.../coser-107-photos-4-videos` at page 1 offset 26 and page 2 offset 26, title=Coser@UmekoJ: Canari (Pokémon Legends Z-A) (106 photos + 6 videos), URL=`.../coserumekoj-canari-pokmon-legends-z-a-106-photos-6-videos` at page 1 offset 27 and page 2 offset 27, title=Coser@ Yuyu - Azur Lane Noshiro Red Veil Bath Shadow (81P), URL=`.../coser-yuyu-azur-lane-noshiro-red-veil-bath-shadow-81p` at page 1 offset 28 and page 2 offset 28, title=Coser@ Year Nnian - Showcase 2 (71P), URL=`.../coser-year-nnian-showcase-2-71p` at page 1 offset 29 and page 2 offset 29, title=Coser@羽生三未 - 霞之丘诗羽兔女郎 (38P), URL=`.../coser-38p` at page 1 offset 30 and page 2 offset 30, title=\[Mik Allen\] Black Cat 1, URL=`.../mik-allen-black-cat-1` at page 1 offset 31 and page 2 offset 31 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=钛alloy TiTi - 黑绫波丽 4, URL=`.../alloy-titi-4` at page 1 offset 20 and page 2 offset 20, title=Cloud Creek Succubus Cosplay エロ image, URL=`.../cloud-creek-succubus-cosplay--image` at page 1 offset 21 and page 2 offset 21, title=Alin ma Xenon - Eliza 3, URL=`.../alin-ma-xenon-eliza-3` at page 1 offset 22 and page 2 offset 22, title=Xenon - Ahri, URL=`.../xenon-ahri` at page 1 offset 23 and page 2 offset 23, title=Aqua Birthday Bunny (AI Generated), URL=`.../aqua-birthday-bunny-ai-generated` at page 1 offset 24 and page 2 offset 24, title=\[Recommendation Beauty\]@buckwheat77777 (Added) (30P), URL=`.../recommendation-beautybuckwheat77777-added-30p` at page 1 offset 25 and page 2 offset 25, title=KittiLittl - Warhammer 40K Drukhari, URL=`.../kittilittl-warhammer-40k-drukhari` at page 1 offset 26 and page 2 offset 26, title=Coser@星之迟迟Hoshilily: 鸣潮 尤诺 (115 photos), URL=`.../coserhoshilily-115-photos` at page 1 offset 27 and page 2 offset 27, title=网红Coser@柒柒要乖哦 黄昏 321, URL=`.../coser-321` at page 1 offset 28 and page 2 offset 28, title=XiuRen No.060, URL=`.../xiuren-no060` at page 1 offset 29 and page 2 offset 29, title=Coser@ Paper Yue Etsu_ko: Azure Archive Kinugawa Kasumi Swimsuit (44 photos), URL=`.../coser-paper-yue-etsu_ko-azure-archive-kinugawa-kasumi-swimsuit-44-photos` at page 1 offset 30 and page 2 offset 30, title=Mikomin - Bunny Asuma, URL=`.../mikomin-bunny-asuma` at page 1 offset 31 and page 2 offset 31 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 141/141 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 141/141 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static17.hentai-cosplay-xxx.com/.../22.webp` (image/webp (encoding: lossy), 2282 bytes, 133x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../aqua-birthday-bunny-ai-generated` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://static17.hentai-cosplay-xxx.com/.../1.webp` (image/webp (encoding: lossy), 41610 bytes, 1280x853) |  |  |  |
