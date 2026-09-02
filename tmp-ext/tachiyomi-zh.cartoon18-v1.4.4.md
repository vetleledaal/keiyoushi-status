# Extension Validation Report

- Extension: tachiyomi-zh.cartoon18-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 32
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 28664779574072063
- Source name: Cartoon18
- Source language: zh
- Selected manga input: latest offset 0: [11_22] ALEX 剧情汉化漫画 AI绘图 CG 中文 假小子 巨乳 怀孕 (`.../V1G8K`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | 秘密教学  (`.../kweLM`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | 迷走都市0-3(终) [小说改编]【国产真人漫画.../%E6%98%8E%E6%98%9FPS%E3%80%91 真人漫画 中文 (`.../9Dyml`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | [11_22] ALEX 剧情汉化漫画 AI绘图 CG 中文 假小子 巨乳 怀孕 (`.../V1G8K`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | [wiking汉化版][Hotsaurus]~fantasy CG集 巨乳 NTR 怀孕 假小子 vaginal 出产 中文 黑肉 肌肉 (`.../N3oPB`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 24 | [11_22] ALEX 剧情汉化漫画 AI绘图 CG 中文 假小子 巨乳 怀孕 (`.../V1G8K`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [11_22] ALEX 剧情汉化漫画 (`.../V1G8K`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | 开始阅读 (`.../full`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 58 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[11_22\] ALEX 剧情汉化漫画 AI绘图 CG 中文 假小子 巨乳 怀孕, URL=`.../V1G8K` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=\[萧肾氪\] 主播小u过度依赖 AI绘图 中出 中文, URL=`.../y1AlV` at page 1 offset 1 and page 2 offset 8, title=\[ジュースボックス工场 (ジュナジュナジュース)\] 仆のハーレムアカデミア08话 彼女たちの决心“中编” 阿黑颜 肛交 口交 口交脸 舔阴 饮精 后宫 怪物女孩 短裤 接吻 多重口交 中出 舔肛 过膝袜 透视 群交 全彩 剧情向 中文, URL=`.../D2y77` at page 1 offset 2 and page 2 offset 7, title=\[ジュースボックス工场 (ジュナジュナジュース)\] 仆のハーレムアカデミア８话：彼女たちの决心（前编） 阿黑颜 巨乳 口交 口交脸 后宫 怪物女孩 兽耳 中出 过膝袜 群交 全彩 剧情向 中文, URL=`.../zDvlr` at page 1 offset 3 and page 2 offset 6, title=\[ジュナジュナジュース\] 直美さん落书き 全彩 巨乳 口交 熟女 中文, URL=`.../oGyaD` at page 1 offset 4 and page 2 offset 5, title=“秘密屋”爆乳姐妹、丰腴熟女妈妈…将一家全部彻底堕落并恩爱相处的故事 阿黑颜 巨乳 口交 超乳 熟女 连裤袜 马尾 AI绘图 中文, URL=`.../QGkr0` at page 1 offset 5 and page 2 offset 4, title=\[Vchan\] Enchanting Beauty 06 千娇百媚 吊带袜 过膝袜 3D 无修正 中文, URL=`.../xwRlb` at page 1 offset 6 and page 2 offset 3, title=想驯服老师什么的，果然是我想错了 \[MTL\] \[白饼あつつ\]先生を躾けようなんて仆が间违ってました yaoi 束缚 单行本 中文, URL=`.../MGk74` at page 1 offset 7 and page 2 offset 2, title=\[CHOMA\] 雌ドレイ宣誓 阿黑颜 肛交 巨乳 口交 出轨 眼镜 多毛 中出 接吻 熟女 NTR 乳环 群交 单行本 中文 假小子, URL=`.../8m15K` at page 1 offset 8 and page 2 offset 1, title=\[wiking汉化版\]\[Hotsaurus\]~fantasy CG集 巨乳 NTR 怀孕 假小子 vaginal 出产 中文 黑肉 肌肉, URL=`.../N3oPB` at page 1 offset 9 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.cartoon18.com/.../273756.avif <redacted query values: 0>` (image/avif (format: avif), 35782 bytes, 400x533) |  |  |  |
| details identity | UNUSUAL | Details changed selected title \[11_22\] ALEX 剧情汉化漫画 AI绘图 CG 中文 假小子 巨乳 怀孕 to \[11_22\] ALEX 剧情汉化漫画 |  |  |  |
| details thumbnail URL | PASS | `https://img.cartoon18.com/.../273756.avif <redacted query values: 0>` |  |  |  |
| details author | PASS | 11_22 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | AI绘图, CG, 中文, 假小子, 巨乳, 怀孕 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 58 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.cartoon18.com/.../28364166.avif <redacted query values: 1784398373>` (image/avif (format: avif), 153447 bytes, 1280x1536) |  |  |  |
