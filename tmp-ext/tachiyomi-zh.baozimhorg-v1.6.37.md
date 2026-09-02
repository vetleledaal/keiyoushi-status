# Extension Validation Report

- Extension: tachiyomi-zh.baozimhorg-v1.6.37
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
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
- Source ID: 774030471139699415
- Source name: GoDa漫画
- Source language: zh
- Selected manga input: popular offset 0: 武炼巅峰 (`.../wuliandianfeng-pikapi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | 武炼巅峰 (`.../wuliandianfeng-pikapi`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | 武林世家的失宠小孙女 (`.../wulinshijiadeshichongxiaosunn-xs634079`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | 八女帝全背叛，重生悔到肠断 (`.../banvdiquanbeipanchongshenghuidaochangduan-26930`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | 离渊纲要 (`.../liyuangangyao-23373`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 30 | 武炼巅峰 (`.../wuliandianfeng-pikapi`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 武炼巅峰 (`.../wuliandianfeng-pikapi`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3875 | 1 扫地小厮 (`.../0_0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=武炼巅峰, URL=`wuliandianfeng-pikapi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=穿越者的幸运礼, URL=`chuanyuezhedexingyunli-ap91419` at page 1 offset 17 and page 2 offset 1 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://c-nc-1.6wm.top/.../30_19_15_325982f153d0f3d4b52d617a579da96e_1640862941502.webp` (image/webp (encoding: lossy), 27296 bytes, 320x426) |  |  |  |
| details identity | PASS | Details preserved selected URL `wuliandianfeng-pikapi` |  |  |  |
| details thumbnail URL | PASS | `https://c-nc-1.6wm.top/.../30_19_15_325982f153d0f3d4b52d617a579da96e_1640862941502.webp` |  |  |  |
| details author | PASS | 噼咔噼, PIKAPI噼咔噼运营 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 国漫, 热门漫画, 古风, 热血, 热门推荐 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 《武炼巅峰》漫画版是由深圳漫画团队噼咔噼绘制，根据阅文集团旗起点中文网的同名小说改编，作者是莫默。武之巅峰，是孤独，是寂寞，是漫漫求索，是高处不胜寒。逆境中成长，绝地里求生，才能堪破武之极道。凌霄阁试炼弟子兼扫地小厮杨开偶获一本无字黑书，从此踏上漫漫武道。<br><br>ID: 12 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3875 chapters |  |  |  |
| chapter dates | PASS | 3875 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://c-nd2-1.6wm.top/.../1.webp` (image/webp (encoding: lossy), 104602 bytes, 800x1131) |  |  |  |
