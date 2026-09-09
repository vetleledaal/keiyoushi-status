# Extension Validation Report

- Extension: tachiyomi-fr.lelscanvf-v1.4.15
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: fuzzydoodle
- Source ID: 4874205281198767614
- Source name: Lelscan-VF
- Source language: fr
- Selected manga input: latest offset 0: Hunter X Hunter (`.../hunter-x-hunter`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Maria No Danzai (`.../maria-no-danzai`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | My Giant Nerd Boyfriend (`.../my-giant-nerd-boyfriend`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 24 | Hunter X Hunter (`.../hunter-x-hunter`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Vinland Saga (`.../vinland-saga`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Hunter X Hunter (`.../hunter-x-hunter`) |  | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | Hunter X Hunter (`.../hunter-x-hunter`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 242 | Chapitre 1 (`.../1`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 92 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hunter X Hunter, URL=`.../hunter-x-hunter` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.lelscanfr.com/.../65db6ab871d0a.webp` (image/webp (encoding: lossy), 46946 bytes, 500x694) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hunter-x-hunter` |  |  |  |
| details thumbnail URL | PASS | `https://www.lelscanfr.com/.../65db6ab871d0a.webp` |  |  |  |
| details author | PASS | Yoshihiro Togashi |  |  |  |
| details artist | PASS | Yoshihiro Togashi |  |  |  |
| details genres | PASS | , Fantastique, Drame, Mature, Surnaturel, Action, Comédie, Tournois, Aventure, Shônen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Après avoir longtemps cru que son père était mort, le jeune Gon découvre qu'il est apparemment toujours en vie mais surtout que c'est un Hunter. Décidé à suivre ces traces il tente passer le très difficile examen annuel des Hunter...<br><br>Alternative Title: ハンターｘハンター ,Охотник х Охотник, Medžiotojas x Medžiotojas, HxH, 全職獵人, Caçador X Caçador, القناص, شکارچی, Jager X Jager |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 242 chapters |  |  |  |
| chapter dates | LINT | 239 of 242 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=239 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 92 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://lelscanfr.com/.../manga <redacted query values: page>` to `https://www.lelscanfr.com/.../manga <redacted query values: page>` (1 redirects); popular_next: `https://lelscanfr.com/.../manga <redacted query values: page>` to `https://www.lelscanfr.com/.../manga <redacted query values: page>` (1 redirects); latest: `https://lelscanfr.com <redacted query values: page>` to `https://www.lelscanfr.com <redacted query values: page>` (1 redirects); latest_next: `https://lelscanfr.com <redacted query values: page>` to `https://www.lelscanfr.com <redacted query values: page>` (1 redirects); search: `https://lelscanfr.com/.../manga <redacted query values: title>` to `https://www.lelscanfr.com/.../manga <redacted query values: title>` (1 redirects); details: `https://lelscanfr.com/.../hunter-x-hunter` to `https://www.lelscanfr.com/.../hunter-x-hunter` (1 redirects); chapters: `https://lelscanfr.com/.../hunter-x-hunter` to `https://www.lelscanfr.com/.../hunter-x-hunter` (1 redirects); pages: `https://lelscanfr.com/.../1` to `https://www.lelscanfr.com/.../1` (1 redirects) |  |  |  |
| page load | PASS | `https://www.lelscanfr.com/.../65db963b6cfc8.webp` (image/webp (encoding: lossy), 62022 bytes, 686x1041) |  |  |  |
