# Extension Validation Report

- Extension: tachiyomi-all.hentaicosplay-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 1
- Warnings: 3
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: hentaicosplayxxx
- Source ID: 3422463439145930309
- Source name: Hentai Cosplay
- Source language: all
- Selected manga input: popular offset 0: Aqua Birthday Bunny (AI Generated) (`.../aqua-birthday-bunny-ai-generated`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | Aqua Birthday Bunny (AI Generated) (`.../aqua-birthday-bunny-ai-generated`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 32 | Hiiragi Utena - Mahou Shoujo ni Akogarete Hiiragi Utena - Mahou Shoujo ni Akogarete (`.../hiiragi-utena-mahou-shoujo-ni-akogarete-hiiragi-utena-mahou-shoujo-ni-akogarete`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 32 | King Angel - Maiden (`.../king-angel-maiden`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 32 | Kouun - ?✨️Ui✨️? (`.../kouun-ui`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 13 | Aqua Birthday Bunny (AI Generated) (`.../aqua-birthday-bunny-ai-generated`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Aqua Birthday Bunny (AI Generated) (`.../aqua-birthday-bunny-ai-generated`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../aqua-birthday-bunny-ai-generated`) |  | <1s |
| pages | `getPageList(chapter)` | success | 54 |  |  | <1s |

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
| popular pagination | UNUSUAL | Overlapping manga: title=023 葱油饼er - 微密圈 EMMM, URL=`.../023-er-emmm` at page 1 offset 20 and page 2 offset 20, title=020 葱油饼er - 微密圈 元神cos, URL=`.../020-er-cos` at page 1 offset 21 and page 2 offset 21, title=033 葱油饼er - 微密圈 灰t, URL=`.../033-er-t` at page 1 offset 22 and page 2 offset 22, title=031 葱油饼er - 微密圈 黑与白, URL=`.../031-er` at page 1 offset 23 and page 2 offset 23, title=2B by Dbsciacca, URL=`.../2b-by-dbsciacca` at page 1 offset 24 and page 2 offset 24, title=Rumipeach - 2B 1, URL=`.../rumipeach-2b-1` at page 1 offset 25 and page 2 offset 25, title=Rumipeach - Teto, URL=`.../rumipeach-teto` at page 1 offset 26 and page 2 offset 26, title=Miinmeow - Qingxiao, URL=`.../miinmeow-qingxiao` at page 1 offset 27 and page 2 offset 27, title=Ain Nguyen - Label, URL=`.../ain-nguyen-label` at page 1 offset 28 and page 2 offset 28, title=Akihira - Tifa, URL=`.../akihira-tifa` at page 1 offset 29 and page 2 offset 29, title=Kaho Shibuya - Dia Mitsumoto, URL=`.../kaho-shibuya-dia-mitsumoto` at page 1 offset 30 and page 2 offset 30, title=Kiyo - Yae Miko, URL=`.../kiyo-yae-miko` at page 1 offset 31 and page 2 offset 31 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Aqua Birthday Bunny (AI Generated), URL=`.../aqua-birthday-bunny-ai-generated` at page 1 offset 24 and page 2 offset 24, title=\[Recommendation Beauty\]@buckwheat77777 (Added) (30P), URL=`.../recommendation-beautybuckwheat77777-added-30p` at page 1 offset 25 and page 2 offset 25, title=KittiLittl - Warhammer 40K Drukhari, URL=`.../kittilittl-warhammer-40k-drukhari` at page 1 offset 26 and page 2 offset 26, title=Coser@星之迟迟Hoshilily: 鸣潮 尤诺 (115 photos), URL=`.../coserhoshilily-115-photos` at page 1 offset 27 and page 2 offset 27, title=网红Coser@柒柒要乖哦 黄昏 321, URL=`.../coser-321` at page 1 offset 28 and page 2 offset 28, title=Coser@ Paper Yue Etsu_ko: Azure Archive Kinugawa Kasumi Swimsuit (44 photos), URL=`.../coser-paper-yue-etsu_ko-azure-archive-kinugawa-kasumi-swimsuit-44-photos` at page 1 offset 29 and page 2 offset 29, title=Mikomin - Bunny Asuma, URL=`.../mikomin-bunny-asuma` at page 1 offset 30 and page 2 offset 30, title=Coser@Misaki Sai - Freezing (44P), URL=`.../cosermisaki-sai-freezing-44p` at page 1 offset 31 and page 2 offset 31 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 141/141 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 141/141 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static17.hentai-cosplay-xxx.com/.../22.webp` (image/webp (encoding: lossy), 2282 bytes, 133x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../aqua-birthday-bunny-ai-generated` |  |  |  |
| details thumbnail URL | PASS | `https://static17.hentai-cosplay-xxx.com/.../22.webp` |  |  |  |
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
| redirects | UNUSUAL | popular: `https://hentai-cosplay-xxx.com/.../1` to `https://hentai-cosplay-xxx.com/.../ranking` (1 redirects); popular: `https://hentai-cosplay-xxx.com/.../1` to `https://hentai-cosplay-xxx.com/.../search` (1 redirects); popular: `https://hentai-cosplay-xxx.com/.../1` to `https://hentai-cosplay-xxx.com/.../Aqua+Birthday+Bunny+(AI+Generated)` (1 redirects) |  |  |  |
| page load | PASS | `https://static17.hentai-cosplay-xxx.com/.../1.webp` (image/webp (encoding: lossy), 41610 bytes, 1280x853) |  |  |  |
