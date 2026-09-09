# Extension Validation Report

- Extension: tachiyomi-all.hentaicosplay-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 0
- Warnings: 3
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3422463439145930309
- Source name: Hentai Cosplay
- Source language: all
- Selected manga input: latest offset 0: Sayo Momo - Kafka Jiang Shi カフカ HSR (`.../sayo-momo-kafka-jiang-shi-hsr`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | Aqua Birthday Bunny (AI Generated) (`.../aqua-birthday-bunny-ai-generated`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 32 | [Online Collection] Welfare Girl Zuo Gongzi "Love in the Palm" VIP Exclusive [36P] (`.../online-collection-welfare-girl-zuo-gongzi-love-in-the-palm-vip-exclusive-36p`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 32 | Sayo Momo - Kafka Jiang Shi カフカ HSR (`.../sayo-momo-kafka-jiang-shi-hsr`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 32 | Nyeupe - Shenhe (`.../nyeupe-shenhe`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 12 | Nyeupe - Shenhe (`.../nyeupe-shenhe`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Sayo Momo - Kafka Jiang Shi カフカ HSR (`.../sayo-momo-kafka-jiang-shi-hsr`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../sayo-momo-kafka-jiang-shi-hsr`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 68 |  |  | 1-10s |

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
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 12 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Nyeupe - Shenhe, URL=`.../nyeupe-shenhe` at page 1 offset 20 and page 2 offset 20, title=Donna loli - Zero Two, URL=`.../donna-loli-zero-two` at page 1 offset 21 and page 2 offset 21, title=Donna Loli - Marine, URL=`.../donna-loli-marine` at page 1 offset 22 and page 2 offset 22, title=Donna Loli - Nezuko, URL=`.../donna-loli-nezuko` at page 1 offset 23 and page 2 offset 23, title=Nookkizz - Aemeath Wuthering Waves, URL=`.../nookkizz-aemeath-wuthering-waves` at page 1 offset 24 and page 2 offset 24, title=Nekolina - Hana Midorikawa from Prison School, URL=`.../nekolina-hana-midorikawa-from-prison-school` at page 1 offset 25 and page 2 offset 25, title=Coser@布丁大法 (Pudding Dafa): 兔子快餐1 (14 photos + 1 video), URL=`.../coser-pudding-dafa-1-14-photos-1-video` at page 1 offset 26 and page 2 offset 26, title=Coser@yuuhui玉汇: 入职考核+S (120 photos + 1 video), URL=`.../coseryuuhui-s-120-photos-1-video` at page 1 offset 27 and page 2 offset 27, title=Chizu-Sexy Seia, URL=`.../chizu-sexy-seia` at page 1 offset 28 and page 2 offset 28, title=Sayo Momo - Kafka Jiang Shi カフカ HSR, URL=`.../sayo-momo-kafka-jiang-shi-hsr` at page 1 offset 29 and page 2 offset 29, title=Aleksa Ndrianecos - Zero Two, URL=`.../aleksa-ndrianecos-zero-two` at page 1 offset 30 and page 2 offset 30, title=Milksparks - Cosmo, URL=`.../milksparks-cosmo` at page 1 offset 31 and page 2 offset 31 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Nyeupe - Shenhe, URL=`.../nyeupe-shenhe` at page 1 offset 20 and page 2 offsets 0, 20, title=Donna loli - Zero Two, URL=`.../donna-loli-zero-two` at page 1 offset 21 and page 2 offset 21, title=Donna Loli - Marine, URL=`.../donna-loli-marine` at page 1 offset 22 and page 2 offset 22, title=Donna Loli - Nezuko, URL=`.../donna-loli-nezuko` at page 1 offset 23 and page 2 offset 23, title=Aqua Birthday Bunny (AI Generated), URL=`.../aqua-birthday-bunny-ai-generated` at page 1 offset 24 and page 2 offset 24, title=\[Recommendation Beauty\]@buckwheat77777 (Added) (30P), URL=`.../recommendation-beautybuckwheat77777-added-30p` at page 1 offset 25 and page 2 offset 25, title=KittiLittl - Warhammer 40K Drukhari, URL=`.../kittilittl-warhammer-40k-drukhari` at page 1 offset 26 and page 2 offset 26, title=Coser@星之迟迟Hoshilily: 鸣潮 尤诺 (115 photos), URL=`.../coserhoshilily-115-photos` at page 1 offset 27 and page 2 offset 27, title=网红Coser@柒柒要乖哦 黄昏 321, URL=`.../coser-321` at page 1 offset 28 and page 2 offset 28, title=XiuRen No.060, URL=`.../xiuren-no060` at page 1 offset 29 and page 2 offset 29, title=Coser@ Paper Yue Etsu_ko: Azure Archive Kinugawa Kasumi Swimsuit (44 photos), URL=`.../coser-paper-yue-etsu_ko-azure-archive-kinugawa-kasumi-swimsuit-44-photos` at page 1 offset 30 and page 2 offset 30, title=Mikomin - Bunny Asuma, URL=`.../mikomin-bunny-asuma` at page 1 offset 31 and page 2 offset 31 |  |  |  |
| listing duplicates | FAIL | Latest page 2 repeats 1 manga entry: title=Nyeupe - Shenhe, URL=`.../nyeupe-shenhe` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 140/140 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 140/140 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static17.hentai-cosplay-xxx.com/.../9.webp` (image/webp (encoding: lossy), 4392 bytes, 112x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sayo-momo-kafka-jiang-shi-hsr` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | vaginal sticker, pasties, Makeup, high heels, Kafka, honkai star rail, vaginal sticker, pasties, Makeup, high heels, Kafka, honkai star rail |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentai-cosplay-xxx.com/.../1` to `https://hentai-cosplay-xxx.com/.../ranking` (1 redirects); latest: `https://hentai-cosplay-xxx.com/.../1` to `https://hentai-cosplay-xxx.com/.../search` (1 redirects); search: `https://hentai-cosplay-xxx.com/.../1` to `https://hentai-cosplay-xxx.com/.../Sayo+Momo+-+Kafka+Jiang+Shi+%E3%82%AB%E3%83%95%E3%82%AB+HSR` (1 redirects) |  |  |  |
| page load | PASS | `https://static17.hentai-cosplay-xxx.com/.../1.webp` (image/webp (encoding: lossy), 69628 bytes, 960x768) |  |  |  |
