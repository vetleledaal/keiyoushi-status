# Extension Validation Report

- Extension: tachiyomi-all.buondua-v1.6.11
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
- Source ID: 1435103006121310663
- Source name: Buon Dua
- Source language: all
- Selected manga input: latest offset 0: [内购无水印] 鱼子酱Fish & 杏子Yada: 双人性感演绎 (125 photos) (`.../nei-gou-wu-shui-yin-yu-zi-jiangfish-xing-ziyada-shuang-ren-xing-gan-yan-yi-125-photos-9ac27aee2780395f9c2dea0ab968697c-56336`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | [AI Enhanced] Dongeuran (동그란): Baby Oil (133 photos) (`.../ai-enhanced-dongeuran-dong-geulan-baby-oil-133-photos-08917f0298e9037da5c30767a4813068-56247`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Coser@铁手叫兽: 未公开作品小合集2 (142 photos) (`.../coser-tie-shou-jiao-shou-wei-gong-kai-zuo-pin-xiao-he-ji2-142-photos-f7e7c086e6e8e8f319179d602e0cc670-56284`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | [内购无水印] 鱼子酱Fish & 杏子Yada: 双人性感演绎 (125 photos) (`.../nei-gou-wu-shui-yin-yu-zi-jiangfish-xing-ziyada-shuang-ren-xing-gan-yan-yi-125-photos-9ac27aee2780395f9c2dea0ab968697c-56336`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Coser@萨隆苦囚: 蝶 (74 photos) (`.../coser-sa-long-ku-qiu-die-74-photos-f38869a22d6355608bd5e2897fe98574-56335`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [内购无水印] 鱼子酱Fish & 杏子Yada: 双人性感演绎 (125 photos) (`.../nei-gou-wu-shui-yin-yu-zi-jiangfish-xing-ziyada-shuang-ren-xing-gan-yan-yi-125-photos-9ac27aee2780395f9c2dea0ab968697c-56336`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [内购无水印] 鱼子酱Fish & 杏子Yada: 双人性感演绎 (125 photos) (`.../nei-gou-wu-shui-yin-yu-zi-jiangfish-xing-ziyada-shuang-ren-xing-gan-yan-yi-125-photos-9ac27aee2780395f9c2dea0ab968697c-56336`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | Page 1 (`.../nei-gou-wu-shui-yin-yu-zi-jiangfish-xing-ziyada-shuang-ren-xing-gan-yan-yi-125-photos-9ac27aee2780395f9c2dea0ab968697c-56336 <redacted query values: page>`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[内购无水印\] 鱼子酱Fish & 杏子Yada: 双人性感演绎 (125 photos), URL=`.../nei-gou-wu-shui-yin-yu-zi-jiangfish-xing-ziyada-shuang-ren-xing-gan-yan-yi-125-photos-9ac27aee2780395f9c2dea0ab968697c-56336` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.buondua.com/.../Built-in-no-watermark-Caviar-Fish-apricot-Yada-Sexy-double-performance-MissKON.com-125.jpeg <redacted query values: c18fc802fad5d12748e717bcf2dd8ab4>` (image/jpeg, 86780 bytes, 1024x1536) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../nei-gou-wu-shui-yin-yu-zi-jiangfish-xing-ziyada-shuang-ren-xing-gan-yan-yi-125-photos-9ac27aee2780395f9c2dea0ab968697c-56336` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 内购无水印, 鱼子酱Fish, 杏子Yada |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | \[👉 Download link: MediaFire\](https://ouo.io/.../DH49zp)<br>\[👉 Download link: Terabox\](https://ouo.io/.../oDogbn)<br><br><redacted credential header: password> |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i2.buondua.com/.../Built-in-no-watermark-Caviar-Fish-apricot-Yada-Sexy-double-performance-MissKON.com-001.jpeg <redacted query values: c18fc802fad5d12748e717bcf2dd8ab4>` (image/jpeg, 350538 bytes, 1024x1536) |  |  |  |
